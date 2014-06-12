def processMessages(messages: List[String]) {      
  var done = false
  var index = 0

  while (index < messages.length && !done) {             
     val message = messages(index)                    
     if (message == "quit") done = true
       
     if (message != "skip") {
       println("Processing " + message)
     }
     index += 1     
  }
}

processMessages(List("code", "skip", "test", "quit", "hack"))
