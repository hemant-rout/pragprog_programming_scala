//START:METHOD
def divide(op1: Double, op2: Double) = op1/op2
//END:METHOD

//START:MULTIPLE     
def max(values: Int*) = values.foldLeft(values(0)) { Math.max }
                         
//END:MULTIPLE

//START:MULTIPLEUSE
println(max(2, 5, 3, 7, 1, 6))
//END:MULTIPLEUSE

//START:ARRAY
val numbers = Array(2, 5, 3, 7, 1, 6)
//END:ARRAY

/*
//START:MULTIPLEUSEARRAY
println(max(numbers)) // type mismatch error
//END:MULTIPLEUSEARRAY
*/

//START:MULTIPLEUSEEXPLODE
println(max(numbers: _*))
//END:MULTIPLEUSEEXPLODE
