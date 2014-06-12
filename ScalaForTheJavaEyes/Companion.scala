import java.util.HashMap

class Marker private (val color: String) {
  println("Creating " + toString())
  
  override def toString() : String = "marker color " + color
}

object Marker {
  private var markers : HashMap[String, Marker] = new HashMap[String, Marker]
  
  def getMarker(color: String) : Marker = {
    if (!markers.containsKey(color)) {
      markers.put(color, new Marker(color))
    }
    
    markers.get(color)
  }
}
