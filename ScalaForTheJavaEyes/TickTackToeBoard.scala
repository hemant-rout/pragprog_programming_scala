class TickTackToeBoard {
  def placePeg(row: Int, column: Int) {
    validateCell(row, column)
    //...
  }      
  
  def isPegX(row: Int, column: Int) : Boolean = {      
     var flag : Boolean = true     
     validateCell(row, column)     
     flag
  }      
  
  private def validateCell(row: Int, column: Int) {
    //... throw exception if not valid...
  }
}
