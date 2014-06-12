def process(input : String) {        
  val MatchStock = """^(.+):(\d*\.\d+)""".r
  input match {
    case MatchStock("GOOG", price) => println("Price of GOOG is " + price)
    case MatchStock("IBM", price) => println("IBM's trading at " + price)
    case MatchStock(symbol, price) => printf("Price of %s is %s\n", symbol, price)
    case _ => println("not processing " + input)
  }
}

process("GOOG:310.84")
process("IBM:84.01")
process("GE:15.96")
