//START:SERVICE
object StockService {
  def process(input : String) {
    input match {
      case Symbol() => println("Look up price for valid symbol " + input)
      case _ => println("Invalid input " + input)      
    }
  }
}
//END:SERVICE

//START:EXTRACTOR
object Symbol {
  def unapply(symbol : String) : Boolean = symbol == "GOOG" || symbol == "IBM" 
    // you'd look up database above... here only GOOG and IBM are recognized
}
//END:EXTRACTOR

//START:GETPRICE
StockService process "GOOG"
StockService process "IBM"
StockService process "ERR"
//END:GETPRICE
