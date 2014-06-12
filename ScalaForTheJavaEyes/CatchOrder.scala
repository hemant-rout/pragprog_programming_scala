try {
  val str = "hello"
  println(str(31))
}
catch {
  case ex : Exception => println("Exception caught")
  case ex : StringIndexOutOfBoundsException => println("Invalid Index")
}
