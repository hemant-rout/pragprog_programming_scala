//START:REDUNDANT    
import java.util.Date

def log(date: Date, message: String) {
 //...                                
 println(date + "----" + message)
}

val date = new Date
log(date, "message1")
log(date, "message2")
log(date, "message3")
//END:REDUNDANT    

//START:PARTIAL
val logWithDateBound = log(new Date, _ : String)
logWithDateBound("message1")
logWithDateBound("message2")
logWithDateBound("message3")
//END:PARTIAL