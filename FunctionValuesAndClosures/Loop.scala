//START:TOTALRESULTOVERRANGE
def totalResultOverRange(number: Int, codeBlock: Int => Int) : Int = {
  var result = 0
  for (i <- 1 to number) {
    result += codeBlock(i)    
  }
  
  result
}                         
//END:TOTALRESULTOVERRANGE

//START:SUM
println(totalResultOverRange(11, i => i))
//END:SUM

//START:COUNTEVEN
println(totalResultOverRange(11, i => if (i % 2 == 0) 1 else 0))
//END:COUNTEVEN
               
//START:COUNTODD
println(totalResultOverRange(11, i => if (i % 2 != 0) 1 else 0))
//END:COUNTODD
