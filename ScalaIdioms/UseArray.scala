//START:NEWARRAY
val arr1 = new Array[int](3)
arr1(0) = 1
arr1(1) = 2
arr1(2) = 3
//END:NEWARRAY

//START:APPLY
val arr2 = Array(1, 2, 3)
//END:APPLY

//START:STRINGARRAY
val arr3 = Array("one", "two", "three")
//END:STRINGARRAY
     
println(arr1.getClass())
println(arr2.getClass())
println(arr3.getClass())
