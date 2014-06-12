class Creature(val id: Int) {
  Creature.count = Creature.count + 1
}

object Creature {                                    
  private var count: Int = 0
  
  def creatureCount() : Int = count
  
  def apply(id: Int) : Creature = new Creature(id)
}                 
