//START:SERVICE
object StockService {
  def process(input : String) {
    input match {
      case Symbol() => println("Look up price for valid symbol " + input)
      case ReceiveStockPrice(symbol, price) => 
        printf("Received price %f for symbol %s\n", price, symbol)
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

//START:RECEIVESTOCKPRICE
object ReceiveStockPrice { 
  def unapply(input: String) : Option[(String, Double)] = {
    try {
      if (input contains ":") {
        val splitQuote = input split ":"
        Some(splitQuote(0), splitQuote(1).toDouble)
      }
      else {
        None
      }
    }
    catch {
      case _ : NumberFormatException => None
    }
  }
}
//END:RECEIVESTOCKPRICE

//START:USE
StockService process "GOOG"
StockService process "GOOG:310.84"
StockService process "GOOG:BUY"
StockService process "ERR:12.21"
//END:USE
