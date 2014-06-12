class Equipment { 
  // Not usable from Java
  def simulate(input: Int)(calculator: Int => Int) : Int = {
    //...
    calculator(input)    
  }
  
  def run(duration: Int) { 
   println("running")
   //...
  }
}
