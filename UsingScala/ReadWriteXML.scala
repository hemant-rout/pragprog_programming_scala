println("/" + "/" + "START:READ_OUTPUT")
//START:READ
import scala.xml._

val stocksAndUnits = XML.load("stocks.xml")
println(stocksAndUnits.getClass())
println("Loaded file has " + (stocksAndUnits \\ "symbol").size +
   " symbol elements")
//END:READ
println("/" + "/" + "END:READ_OUTPUT")

println("/" + "/" + "START:PARSE_OUTPUT")
//START:PARSE              
val stocksAndUnitsMap =
  (Map[String, Int]() /: (stocksAndUnits \ "symbol")) { (map, symbolNode) =>
    val ticker = (symbolNode \ "@ticker").toString
    val units = (symbolNode \ "units").text.toInt
    map(ticker) = units //Creates and returns a new Map
  }
  
println("Number of symbol elements found is " + stocksAndUnitsMap.size)
//END:PARSE
println("/" + "/" + "END:PARSE_OUTPUT")

println("/" + "/" + "START:STORE_OUTPUT")
//START:STORE
val updatedStocksAndUnitsXML = 
<symbols>
  { stocksAndUnitsMap.map { updateUnitsAndCreateXML } }
</symbols>

def updateUnitsAndCreateXML(element : (String, Int)) = {
  val (ticker, units) = element
  <symbol ticker={ticker}>
    <units>{units + 1}</units>
  </symbol>
}

XML save ("stocks2.xml", updatedStocksAndUnitsXML)
println("The saved file contains " + 
  (XML.load("stocks2.xml") \\ "symbol").size + " symbol elements")
//END:STORE
println("/" + "/" + "END:STORE_OUTPUT")
