//START:LOOP
def loopThrough(number: Int)(closure: Int => Unit) {
  for (i <- 1 to number) { closure(i) }
}
//END:LOOP
                   
//START:CLOSURE         
var result = 0
val addIt = { value:Int => result += value }
//END:CLOSURE         

//START:ADD
loopThrough(10) { addIt }
println("Total of values from 1 to 10 is " + result)
            
result = 0
loopThrough(5) { addIt }
println("Total of values from 1 to 5 is " + result)
//END:ADD

//START:PRODUCT         
var product = 1
loopThrough(5) { product *= _ }
println("Product of values from 1 to 5 is " + product)
//END:PRODUCT
