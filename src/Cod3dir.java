import java.util.ArrayList;

public class Cod3dir {
    public static Integer labelCounter = 0;
    String opType; // Ass
    Info operando1;
    Info operando2;
    Info result;
    Integer label;

    public Cod3dir(String opType, Info operando1, Info operando2, Info result,Integer label) { //constructor para operaciones aritmeticas, asignaciones y retornos
        this.opType = opType;
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.result = result;
        this.label = label;
    }
    public Cod3dir(String opType,Integer label){ //constructor para sentencias IF
        this.opType = opType;
        this.label = label;
    }

    public static String genLine(Cod3dir codigo) {
        String c1, c2, r;
        if(codigo.result != null)r = codigo.result.nombre;
        else r = "none";
        String outputString = "null";
        if (codigo.opType == "SUM" || codigo.opType == "MUL") {
            if (codigo.operando1.etiqueta == 10)
                c1 = codigo.operando1.value.toString();
            else
                c1 = codigo.operando1.nombre;
            if (codigo.operando2.etiqueta == 10)
                c2 = codigo.operando2.value.toString();
            else
                c2 = codigo.operando2.nombre;
            outputString = (codigo.opType + " " + c1 + " " + c2 + " " + r);
        }
        if (codigo.opType == "ASSGN") {
            c1 = codigo.operando1.nombre;
            outputString = (codigo.opType + " " + c1 + " # " + r); // MOV
        }
        if (codigo.opType == "RET") {
            outputString = (codigo.opType + " # # " + r);
        }
        if (codigo.opType == "CMP") {
            // Comparaciones
            c1 = (codigo.operando1.etiqueta == 10) ? codigo.operando1.value.toString() : codigo.operando1.nombre;
            c2 = (codigo.operando2.etiqueta == 10) ? codigo.operando2.value.toString() : codigo.operando2.nombre;
            outputString = (codigo.opType + " " + c1 + " " + c2 + " " + r); // Comparación
        }
        if (codigo.opType == "JMP") {
            outputString = (codigo.opType+ " .L"+codigo.label+":");
        }
        if (codigo.opType == "labelstart") outputString = ".L"+codigo.label+":";
        if(codigo.opType == "Operror!") outputString = "ERROR";
        if(outputString == "null")System.out.println(codigo.opType);
        return outputString;
    }

    public static ArrayList<Cod3dir> treeToC3d(Nodo actual){
        ArrayList<Cod3dir> lista = new ArrayList<>();
        

        if (actual.izq != null) {
            lista.addAll(Cod3dir.treeToC3d(actual.izq));
        }

        if(actual.info.etiqueta == Simbolo.IF){
            lista.add(Cod3dir.genCode(actual));
            System.out.println("IF detectado");
        }

        if (actual.der != null) {
            lista.addAll(Cod3dir.treeToC3d(actual.der));
        }
        if(actual.info.etiqueta == Simbolo.IF){
            lista.add(new Cod3dir("labelstart", labelCounter+1));
        }
        if(Cod3dir.canBeGenerated(actual.info.etiqueta)){
            lista.add(Cod3dir.genCode(actual));
        }
        return lista;
    }

    public static boolean canBeGenerated(Integer etiqueta){
        return (
            etiqueta == Simbolo.PLUS ||
            etiqueta == Simbolo.STAR ||
            etiqueta == Simbolo.GREATER ||
            etiqueta == Simbolo.LESS ||
            etiqueta == Simbolo.EQUAL ||
            etiqueta == Simbolo.RETURN
        );
    }

    public static Cod3dir genCode(Nodo actual){
        Cod3dir linea;
        switch(actual.info.etiqueta){
            case Simbolo.PLUS:
                linea = new Cod3dir("SUM", actual.izq.info, actual.der.info, actual.info, Cod3dir.labelCounter);
                break;
            case Simbolo.STAR:
                linea = new Cod3dir("MUL", actual.izq.info, actual.der.info, actual.info, Cod3dir.labelCounter);
                break;
            case Simbolo.EQUAL:
                linea = new Cod3dir("ASSGN", actual.der.info, null, actual.izq.info, Cod3dir.labelCounter);
                break;
            case Simbolo.RETURN:
                linea = new Cod3dir("RET", null, null, actual.izq.info, Cod3dir.labelCounter);
                break;
            case Simbolo.GREATER:
            case Simbolo.LESS:
                Cod3dir.labelCounter++;
                linea = new Cod3dir("CMP", actual.izq.info, actual.der.info, actual.info, Cod3dir.labelCounter);
                break;
            case Simbolo.IF:
                Cod3dir.labelCounter++;
                linea = new Cod3dir("JMP", actual.izq.info, actual.der.info, actual.info, Cod3dir.labelCounter);
                break;
            default:
                linea = new Cod3dir("OPerror! : etiqueta ->"+actual.info.etiqueta, null);
        }
        return linea;
    }

}
