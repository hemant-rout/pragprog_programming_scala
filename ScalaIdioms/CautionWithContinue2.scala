def processMessages(messages: List[String]) {      
  var done = false
  for (message <- messages) {             
     if (!done) {
       if (message == "quit") done = true
         
       if (message != "skip") {
         println("Processing " + message)
       }
     }
  }
}

processMessages(List("code", "skip", "test", "quit", "hack"))
