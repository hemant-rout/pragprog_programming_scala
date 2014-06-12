//START:DEFINEPATTERN
val pattern = "(S|s)cala".r        
val str = "Scala is scalable and cool"
println(pattern findFirstIn str)
//END:DEFINEPATTERN

//START:FINDALLIN
println((pattern findAllIn str).mkString(", "))
//END:FINDALLIN

//START:REPLACE
println("cool".r replaceFirstIn(str, "awesome"))
//END:REPLACE
