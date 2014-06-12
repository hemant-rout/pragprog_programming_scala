//START:DEF
class Human(val name: String) {
  def listen() = println("Your friend " + name + " is listening")
}

class Man(override val name: String) extends Human(name)
class Woman(override val name: String) extends Human(name)
//END:DEF

println(new Man("John").getClass())
println(new Woman("Sara").getClass())
