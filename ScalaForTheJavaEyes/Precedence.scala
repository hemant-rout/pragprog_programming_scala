//START:PRECEDENCE
class Item(val name: String) {
  def +(other: Item) : Item = new Item("'" + name + " and " + other.name + "'")
  def +-(other: Item) : Item = new Item("--" + name + " and some " + other.name + "--")
  
  def &(other: Item) : Item = new Item(name + " with " + other.name)
  
  override def toString() : String = name
}

val coffee = new Item("Coffee")
val sugar = new Item("Sugar")
val milk = new Item("Milk")
val cream = new Item("Cream")
//END:PRECEDENCE
                
//START:EXPRESSION
println(coffee & milk + sugar +- cream)
//END:EXPRESSION
