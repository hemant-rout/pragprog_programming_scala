//START:DEF
class Cow {
  def ^(moon: Moon) = println("Cow jumped over the moon")
}        

class Moon {
  def ^:(cow: Cow) = println("This cow jumped over the moon too")
}
//END:DEF
         
//START:CALL
val cow = new Cow
val moon = new Moon

cow ^ moon
cow ^: moon
//END:CALL
