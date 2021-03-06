//START:ISPRIME
import scala.actors._
import Actor._

def isPrime(number: Int) = { 
  println("Going to find if " + number + " is prime")

  var result = true

  if (number > 1 && number < 4) result = true
              
  for (i <- 2 to Math.sqrt(number.toDouble).floor.toInt; if result) {               
    if (number % i == 0) result = false
  }
                              
  println("done finding if " + number + " is prime")                              
  result
}
//END:ISPRIME

//START:ACTOR
val primeTeller = actor {
  var continue = true
  
  while (continue) {
    receive {
    //START:CHANGE
    //case (caller : Actor, number: Int) => caller ! (number, isPrime(number))
    case (caller : Actor, number: Int) => actor { caller ! (number, isPrime(number)) }
    //END:CHANGE
      case "quit" => continue = false
    }
  }
}
//END:ACTOR

//START:USE
primeTeller ! (self, 2)
primeTeller ! (self, 131)
primeTeller ! (self, 132)

for (i <- 1 to 3) {
  receive {
    case (number, result) => println(number + " is prime? " + result)
  }
}

primeTeller ! "quit"
//END:USE
