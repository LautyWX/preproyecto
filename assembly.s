main:
pushq %rbp
movq %rsp, %rbp
movq $3, %rax
addq $1, %rax
movq %rax, -64(%rbp)
movq -64(%rbp), %rax
movq %rax, -48(%rbp)
movl -16(%rbp), %eax
cmpl $5, %eax
jne.L1
movl $30, -80(%rbp)
jmp.L2
.L1:
movl $150, -96(%rbp)
.L2:
movq -16(%rbp), %rax
popq %rbp
ret
