
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Tue Oct 08 12:35:37 ART 2024
//----------------------------------------------------

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import java.util.List;

/** CUP v0.10k generated parser.
  * @version Tue Oct 08 12:35:37 ART 2024
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\003\011\000\002\002\004\000\002\003" +
    "\011\000\002\007\004\000\002\007\004\000\002\007\002" +
    "\000\002\004\005\000\002\005\006\000\002\005\005\000" +
    "\002\005\004\000\002\006\005\000\002\006\005\000\002" +
    "\006\005\000\002\006\003\000\002\006\003\000\002\006" +
    "\003\000\002\006\003\000\002\010\003\000\002\010\003" +
    "\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\006\004\005\006\004\001\002\000\004\007" +
    "\053\001\002\000\004\007\010\001\002\000\004\002\007" +
    "\001\002\000\004\002\000\001\002\000\004\020\011\001" +
    "\002\000\004\021\012\001\002\000\004\022\013\001\002" +
    "\000\014\004\015\005\016\010\023\013\022\023\ufffc\001" +
    "\002\000\004\023\052\001\002\000\004\013\ufff0\001\002" +
    "\000\004\013\uffef\001\002\000\004\017\047\001\002\000" +
    "\004\013\022\001\002\000\014\004\015\005\016\010\023" +
    "\013\022\023\ufffc\001\002\000\006\017\uffee\024\uffee\001" +
    "\002\000\016\011\030\012\032\013\026\014\031\020\034" +
    "\024\027\001\002\000\014\004\015\005\016\010\023\013" +
    "\022\023\ufffc\001\002\000\004\023\ufffd\001\002\000\012" +
    "\015\ufff4\016\ufff4\021\ufff4\024\ufff4\001\002\000\014\004" +
    "\ufff8\005\ufff8\010\ufff8\013\ufff8\023\ufff8\001\002\000\012" +
    "\015\ufff2\016\ufff2\021\ufff2\024\ufff2\001\002\000\012\015" +
    "\ufff3\016\ufff3\021\ufff3\024\ufff3\001\002\000\012\015\ufff1" +
    "\016\ufff1\021\ufff1\024\ufff1\001\002\000\010\015\040\016" +
    "\036\024\043\001\002\000\014\011\030\012\032\013\026" +
    "\014\031\020\034\001\002\000\010\015\040\016\036\021" +
    "\037\001\002\000\014\011\030\012\032\013\026\014\031" +
    "\020\034\001\002\000\012\015\ufff5\016\ufff5\021\ufff5\024" +
    "\ufff5\001\002\000\014\011\030\012\032\013\026\014\031" +
    "\020\034\001\002\000\012\015\ufff7\016\036\021\ufff7\024" +
    "\ufff7\001\002\000\012\015\ufff6\016\ufff6\021\ufff6\024\ufff6" +
    "\001\002\000\014\004\ufff9\005\ufff9\010\ufff9\013\ufff9\023" +
    "\ufff9\001\002\000\004\023\ufffe\001\002\000\004\024\046" +
    "\001\002\000\014\004\ufffb\005\ufffb\010\ufffb\013\ufffb\023" +
    "\ufffb\001\002\000\014\011\030\012\032\013\026\014\031" +
    "\020\034\001\002\000\010\015\040\016\036\024\051\001" +
    "\002\000\014\004\ufffa\005\ufffa\010\ufffa\013\ufffa\023\ufffa" +
    "\001\002\000\004\002\001\001\002\000\004\020\054\001" +
    "\002\000\004\021\055\001\002\000\004\022\056\001\002" +
    "\000\014\004\015\005\016\010\023\013\022\023\ufffc\001" +
    "\002\000\004\023\060\001\002\000\004\002\uffff\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\004\003\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\004" +
    "\020\005\023\007\013\010\017\011\016\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\011\044\001\001\000\014\004\020\005\023" +
    "\007\043\010\017\011\016\001\001\000\002\001\001\000" +
    "\004\006\032\001\001\000\014\004\020\005\023\007\024" +
    "\010\017\011\016\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\034\001" +
    "\001\000\002\001\001\000\004\006\041\001\001\000\002" +
    "\001\001\000\004\006\040\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\006\047\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\004" +
    "\020\005\023\007\056\010\017\011\016\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public Nodo padre; //o nodo raiz
    public ArrayList<String> texto = new ArrayList<>();
    public int contador = 0;
    public SymbolTable symbolTable = new SymbolTable();  // Instanciar la tabla de sÃ­mbolos
    public Integer returnValue = 0;
    public ArrayList<String> codeOutput = new ArrayList<>();
    public Integer offSetCounter = -16;
    public Integer tmpNameCounter = 0;
    public ArrayList<Cod3dir> cod3dirList = new ArrayList<>();

    @Override
    public void syntax_error(Symbol s){
        System.out.println(s  +" Linea "+s.left+1 +"  Columna "+s.right   +" "+ (String)s.value);
    }

    @Override
    public void unrecovered_syntax_error(Symbol s){
        System.out.println(s);
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // VAR ::= ID 
            {
              Nodo RESULT = null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"variable:"+id.toString());
            
            // Buscar la variable en la tabla de sÃ­mbolos
            //String varName = id.toString();
            //Info varInfo = parser.symbolTable.lookup(varName);
            
            Nodo tmp = new Nodo(new Info(id.toString(),Simbolo.ID,null,"variable",parser.offSetCounter),parser.contador);
            parser.offSetCounter = parser.offSetCounter - 16;
            RESULT = tmp;

        
              CUP$Parser$result = new java_cup.runtime.Symbol(7/*VAR*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // TYPE ::= BOOL 
            {
              Nodo RESULT = null;
		
            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"TYPE BOOL");
			Nodo tmp = new Nodo(new Info("booleano",Simbolo.BOOL,null,"booleano"),parser.contador);
			RESULT = tmp;
		
              CUP$Parser$result = new java_cup.runtime.Symbol(6/*TYPE*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // TYPE ::= INT 
            {
              Nodo RESULT = null;
		
            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"TYPE INT");
			Nodo tmp = new Nodo(new Info("entero",Simbolo.INT,null,"entero"),parser.contador);
			RESULT = tmp;
		
              CUP$Parser$result = new java_cup.runtime.Symbol(6/*TYPE*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EXP ::= FALSE 
            {
              Nodo RESULT = null;
		
            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"FALSE");
			Nodo tmp = new Nodo(new Info("false",Simbolo.FALSE,0,"booleano"),parser.contador);
            RESULT = tmp;
        
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*EXP*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // EXP ::= TRUE 
            {
              Nodo RESULT = null;
		
            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"TRUE");
			Nodo tmp = new Nodo(new Info("true",Simbolo.TRUE,1,"booleano"),parser.contador);
            RESULT = tmp;
        
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*EXP*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // EXP ::= NUMBER 
            {
              Nodo RESULT = null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"num: "+Integer.parseInt(n.toString()));
            Nodo tmp = new Nodo(new Info(n.toString(),Simbolo.NUMBER,Integer.parseInt(n.toString()),"entero"),parser.contador);
            RESULT = tmp;
        
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*EXP*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // EXP ::= ID 
            {
              Nodo RESULT = null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+id.toString());


            // Buscar la variable en la tabla de sÃ­mbolos
            String varName = id.toString();
            Info varInfo = parser.symbolTable.lookup(varName);
            if (varInfo == null) {
                System.out.println("Error: Variable '" + varName + "' no ha sido declarada.");
            }else{
                Nodo tmp = new Nodo(varInfo,parser.contador);
                RESULT = tmp;
            }
        
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*EXP*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // EXP ::= LPAREN EXP RPAREN 
            {
              Nodo RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Nodo e = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
            /*parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"(expresion)");
			Nodo tmp = new Nodo(new Info("expresion",null,e.info.value,null),parser.contador);
			tmp.addHijoIzq(e);*/
            RESULT = e;
        
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*EXP*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // EXP ::= EXP STAR EXP 
            {
              Nodo RESULT = null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Nodo a = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Nodo b = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
            parser.contador++;
            parser.tmpNameCounter++;
            // Verificar que ambos operandos son del mismo tipo y compatibles con suma
            if (!a.info.tipo.equals("entero") || !b.info.tipo.equals("entero")) {
                throw new RuntimeException("Error: Tipos incompatibles en suma. Ambos deben ser enteros.");
            }else{
                int resultadoProducto=a.info.value*b.info.value;
                parser.texto.add("graphid:"+parser.contador+" # "+"exp * exp");
                Info tmpInfo = new Info("tmp"+parser.tmpNameCounter.toString(),Simbolo.STAR,resultadoProducto,"entero");
                Nodo tmp = new Nodo(tmpInfo,parser.contador);
                tmp.addHijoIzq(a);
                tmp.addHijoDer(b);
                RESULT = tmp;

                //segmento cod3dir...
                parser.codeOutput.add(Cod3dir.genLine("MUL",a.info,b.info,tmp.info));
                parser.cod3dirList.add(new Cod3dir("SUM",a.info,b.info,tmp.info));
                //
            }
        
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*EXP*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // EXP ::= EXP PLUS EXP 
            {
              Nodo RESULT = null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Nodo a = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Nodo b = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
            parser.contador++;
            parser.tmpNameCounter++;
             // Verificar que ambos operandos son del mismo tipo y compatibles con suma
            if (!a.info.tipo.equals("entero") || !b.info.tipo.equals("entero")) {
                throw new RuntimeException("Error: Tipos incompatibles en suma. Ambos deben ser enteros.");
            }else{
                int resultadoSuma=a.info.value + b.info.value;
                parser.texto.add("graphid:"+parser.contador+" # "+"exp + exp");
                Info tmpInfo = new Info("tmp"+parser.tmpNameCounter.toString(),Simbolo.PLUS,resultadoSuma,"entero");
                Nodo tmp = new Nodo(tmpInfo,parser.contador);
                tmp.addHijoIzq(a);
                tmp.addHijoDer(b);
                RESULT = tmp;

                //segmento cod3dir...
                parser.codeOutput.add(Cod3dir.genLine("SUM",a.info,b.info,tmp.info));
                parser.cod3dirList.add(new Cod3dir("SUM",a.info,b.info,tmp.info));
                //
            }
        
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*EXP*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // STATEMENT ::= RETURN SEMICOLON 
            {
              Nodo RESULT = null;
		
            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"return;");
            Nodo tmp = new Nodo(new Info("return",Simbolo.RETURN,null,null),parser.contador);
            
			RESULT = tmp;
        
              CUP$Parser$result = new java_cup.runtime.Symbol(3/*STATEMENT*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // STATEMENT ::= RETURN EXP SEMICOLON 
            {
              Nodo RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Nodo e = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
            parser.contador++;
            parser.tmpNameCounter++;
            parser.texto.add("graphid:"+parser.contador+" # "+"RETURN EXP:e SEMICOLON");
            Nodo tmp = new Nodo(new Info("tmp"+parser.tmpNameCounter.toString(),Simbolo.RETURN,null,null),parser.contador);
			tmp.addHijoIzq(e);
            parser.returnValue = e.info.value;
            // segmento cod3dir
            parser.codeOutput.add(Cod3dir.genLine("RET",null,null,e.info));
            parser.cod3dirList.add(new Cod3dir("RET",null,null,e.info));
            //
			RESULT = tmp;
        
              CUP$Parser$result = new java_cup.runtime.Symbol(3/*STATEMENT*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // STATEMENT ::= VAR EQUAL EXP SEMICOLON 
            {
              Nodo RESULT = null;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Nodo v = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Nodo e = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
            parser.contador++;
            parser.tmpNameCounter++;
            //  Verificar que el tipo de la variable y la expresiÃ³n sean compatibles
            Info varInfo = parser.symbolTable.lookup(v.info.nombre);
            if (varInfo == null) {
                throw new RuntimeException("Error: Variable '" + v.info.nombre + "' no estÃ¡ declarada.");
            }
            if (!varInfo.tipo.equals(e.info.tipo)) {
                throw new RuntimeException("Error: Tipos incompatibles en asignaciÃ³n. Se esperaba " + varInfo.tipo + " pero se obtuvo " + e.info.tipo);
            }else{

                parser.texto.add("graphid:"+parser.contador+" # variable = expresion");
                Nodo tmp = new Nodo(new Info("\"=\"",Simbolo.EQUAL,null,null),parser.contador);
                tmp.addHijoIzq(v);
                tmp.addHijoDer(e);

                //codigo de interprete
                parser.symbolTable.changeSymbolValue(v.info.nombre,e.info.value);

                //segmento cod3dir
                parser.codeOutput.add(Cod3dir.genLine("ASSGN",e.info,null,v.info));
                parser.cod3dirList.add(new Cod3dir("ASSGN",e.info,null,v.info));
                RESULT = tmp;
            }

        
              CUP$Parser$result = new java_cup.runtime.Symbol(3/*STATEMENT*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // DECL ::= TYPE VAR SEMICOLON 
            {
              Nodo RESULT = null;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Nodo t = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Nodo v = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"DECLARACION: "+ t.info.tipo + "variable;");
			
            // Verificar si la variable ya existe en el Ã¡mbito actual
            String varName = v.info.nombre;
            if (parser.symbolTable.lookup(varName) != null) {
                System.out.println("Error: Variable '" + varName + "' ya declarada.");
            } else {
                // Agregar la variable a la tabla de sÃ­mbolos
                System.out.println("info.nombre: "+v.info.nombre);
                parser.symbolTable.addSymbol(varName, parser.contador, null, t.info.tipo, v.info.offSet);
                Nodo tmp = new Nodo(new Info("declaracion",-1,0,null),parser.contador); //test, todos los valores seran inicializados en 0
                tmp.addHijoIzq(t);
                tmp.addHijoDer(v);
                RESULT = tmp;
            }

        
              CUP$Parser$result = new java_cup.runtime.Symbol(2/*DECL*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // BLOCK ::= 
            {
              Nodo RESULT = null;
		
			RESULT = null;
		
              CUP$Parser$result = new java_cup.runtime.Symbol(5/*BLOCK*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // BLOCK ::= STATEMENT BLOCK 
            {
              Nodo RESULT = null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Nodo s = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Nodo b = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
            // Entrar a un nuevo alcance
            parser.symbolTable.enterScope();
            
            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"sentencia y bloque");
            Nodo tmp = new Nodo(new Info("bloque",-1,null,null),parser.contador);
			tmp.addHijoIzq(s);
			tmp.addHijoDer(b);
			RESULT = tmp;

            // Salir del alcance al terminar el bloque
            parser.symbolTable.exitScope();
        
              CUP$Parser$result = new java_cup.runtime.Symbol(5/*BLOCK*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // BLOCK ::= DECL BLOCK 
            {
              Nodo RESULT = null;
		int dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Nodo d = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right;
		Nodo b = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-0)).value;
		
            // Entrar a un nuevo alcance
            parser.symbolTable.enterScope();

            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"declaracion y bloque");
            Nodo tmp = new Nodo(new Info("bloque",-1,null,null),parser.contador);
			tmp.addHijoIzq(d);
			tmp.addHijoDer(b);

			RESULT = tmp;
            // Salir del alcance al terminar el bloque
            parser.symbolTable.exitScope();
        
              CUP$Parser$result = new java_cup.runtime.Symbol(5/*BLOCK*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // PROGRAM ::= VOID MAIN LPAREN RPAREN LBRACE BLOCK RBRACE 
            {
              Nodo RESULT = null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Nodo a = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"void main :");
            Nodo tmp = new Nodo(new Info("programa",-1,null,null),parser.contador);
			tmp.addHijoIzq(a);
			parser.padre = tmp;
            parser.returnValue = null;
			RESULT = tmp;
        
              CUP$Parser$result = new java_cup.runtime.Symbol(1/*PROGRAM*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= PROGRAM EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Nodo start_val = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // PROGRAM ::= INT MAIN LPAREN RPAREN LBRACE BLOCK RBRACE 
            {
              Nodo RESULT = null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Nodo a = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
            parser.contador++;
            parser.texto.add("graphid:"+parser.contador+" # "+"int main :");
            Nodo tmp = new Nodo(new Info("programa",-1,null,null),parser.contador);
			tmp.addHijoIzq(a);
			parser.padre = tmp;
            
			RESULT = tmp;
        
              CUP$Parser$result = new java_cup.runtime.Symbol(1/*PROGRAM*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

