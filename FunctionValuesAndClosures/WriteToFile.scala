//START:FUNCTION
import java.io._

def writeToFile(fileName: String)(codeBlock : PrintWriter => Unit) = {
  val writer = new PrintWriter(new File(fileName))
  try { codeBlock(writer) } finally { writer.close() }
}
//END:FUNCTION

//START:USE
writeToFile("output.txt") { writer =>
  writer write "hello from Scala"
}
//END:USE
