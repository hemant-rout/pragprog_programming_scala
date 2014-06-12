import investments._

val investment = new Investment("XYZ Corporation", InvestmentType.STOCK)

//START:YIELDERROR
//val theYield1 = investment.yield   //ERROR
//val theYield2 = investment.yield() //ERROR
//END:YIELDERROR

//START:YIELD
val theYield1 = investment.`yield`
val theYield2 = investment.`yield`()
//END:YIELD                        

println(theYield1)
println(theYield2)