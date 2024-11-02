main:
pushq %rbp
movq %rsp, %rbp
movq $3, %rax
addq $1, %rax
movq %rax, -64(%rbp)
movq -64(%rbp), %rax
movq %rax, -16(%rbp)
movl $30, -16(%rbp)
movl $150, -32(%rbp)
movl -16(%rbp), %eax
cmpl $3, %eax
jg.L1
movl $0, -16(%rbp)
jmp.L2
.L1:
movl $0, -32(%rbp)
.L2:
movq -16(%rbp), %rax
popq %rbp
ret
