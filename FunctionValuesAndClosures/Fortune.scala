//START:METHOD
import java.util.Date

def tellFortune(useIt: (Date, String) => Unit) {
  val fortunes = Array(
    "You're talented in many ways...", 
    "Your days are filled with ceremony", 
    "Just do it", 
    "Exciting times ahead", 
    "Test early, test often")

  useIt(new Date, fortunes((Math.random * 5).toInt))
}
//END:METHOD
                                    
//START:ONEUSE                                                 
tellFortune { (date, message) => 
  println("Fortune for " + date + " is " + message)
}

tellFortune { (date, message) => 
  println("Fortune for " + date + " is " + message)
}
//END:ONEUSE

//START:BETTERUSE
val useFortune = { (date : Date, message: String) => 
  println("Fortune for " + date + " is " + message) }

tellFortune(useFortune)
tellFortune(useFortune)
//END:BETTERUSE
