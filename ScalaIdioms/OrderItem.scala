//START:CLASSDEF
class OrderItem(val title: String, var quantity: Int) {                                        
  override def toString() : String = "Title " + title + ", Quantity " + quantity
}

object OrderItem {
  def apply(title: String, quantity: Int) = new OrderItem(title, quantity)
}
//END:CLASSDEF
              
//START:USENEW
val item1 = new OrderItem("The Art of Computer Programming", 1)
//END:USENEW

//START:USEAPPLY
var item2 = OrderItem("The Pragmatic Programmer", 1)
//END:USEAPPLY

//START:EXPLICITAPPLY
OrderItem.apply("The Pragmatic Programmer", 1)
//END:EXPLICITAPPLY
              
println(item1)
println(item2)
