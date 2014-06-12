val op1, op2 = 0

//START:IF                                                   
val result = 
  if (op2 != 0)
    op1/op2
  else
    throw new ArithmeticException("Division by Zero")
//END:IF    
println(result)