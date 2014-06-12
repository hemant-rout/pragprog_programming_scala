//START:DEF
class Brushes {
  var colors = new Array[String](5)
  
  def update(index: Int, color: String) { 
    if (index < 0 || index > 4) {
      throw new IllegalArgumentException("Invalid index. Must be between 0 and 4.")
    }
                         
    if (colors.contains(color)) {
      throw new IllegalArgumentException("Color already present.");
    }
    else {
      colors(index) = color
    }
  }
}
//END:DEF

//START:USE
val brushes = new Brushes
brushes(0) = "Red"
brushes(1) = "Blue"
brushes(2) = "Green"
//END:USE

//START:ANOTHERUSE
brushes(4) = "Orange"
//END:ANOTHERUSE    

try {
//START:EXPLICIT
brushes.update(4, "Orange")
//END:EXPLICIT
}
catch {
 case _ => println("Exception received")
}
