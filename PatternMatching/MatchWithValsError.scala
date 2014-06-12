class Sample {
  val max = 100
  val MIN = 0

  def process(input: Int) {
    input match {
      case max => println("Don't try this at home") // Compiler error
      case MIN => println("You matched min")
      case _ => println("Unreachable!!")
    }
  }
}
