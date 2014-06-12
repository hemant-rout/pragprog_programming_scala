//START:SUM
val arr = Array(1, 2, 3, 4, 5)

println("Sum of all values in array is " + 
 (0 /: arr) { (sum, elem) => sum + elem }
)
//END:SUM
         
//START:UNDERSCORE
println("Sum of all values in array is " + 
 (0 /: arr) { _ + _ }
)
//END:UNDERSCORE
                              
//START:EXISTS
val negativeNumberExists = arr.exists { _ < 0 }
println("Array has negative number? " + negativeNumberExists)
//END:EXISTS                                  
                    
//START:PARAMETERLIST1
def max2(a: Int, b: Int) : Int = if (a > b) a else b
var max = (Integer.MIN_VALUE /: arr) { (large, elem) => max2(large, elem) }
//END:PARAMETERLIST1

//START:PARAMETERLIST2
max = (Integer.MIN_VALUE /: arr) { max2(_, _) }
//END:PARAMETERLIST2                                                     

//START:PARAMETERLIST3
max = (Integer.MIN_VALUE /: arr) { max2 _ }
//END:PARAMETERLIST3                                                     

//START:PARAMETERLIST4
max = (Integer.MIN_VALUE /: arr) { max2 }
//END:PARAMETERLIST4

println(max)