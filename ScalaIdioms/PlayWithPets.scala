//START:DEF
class Pet(val name: String) {
  override def toString() = name
}

class Dog(override val name: String) extends Pet(name)

def workWithPets(pets: Array[Pet]) {}
//END:DEF

//START:PLAY
def playWithPets[T <: Pet](pets: Array[T]) = 
  println("Playing with pets: " + pets.mkString(", "))          
//END:PLAY        

//START:DOGS
val dogs = Array(new Dog("Rover"), new Dog("Comet"))
//END:DOGS    
/*
//START:USEDOG
workWithPets(dogs) // Compilation ERROR
//END:USEDOG
*/

//START:PLAYWITHDOGS
playWithPets(dogs)
//END:PLAYWITHDOGS

//START:COPY
def copyPets[S, D >: S](fromPets: Array[S], toPets: Array[D]) = { //...  
}

val pets = new Array[Pet](10)
copyPets(dogs, pets)
//END:COPY
