//START:WRITE
import java.io._

val writer = new PrintWriter(new File("symbols.txt"))

writer write "AAPL"
writer.close()
//END:WRITE
println(scala.io.Source.fromFile("symbols.txt").mkString)