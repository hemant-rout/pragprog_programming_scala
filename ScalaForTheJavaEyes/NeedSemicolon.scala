object Sample {
  def apply() : Sample = new Sample
}           
              
class Sample

val sample1 = new Sample //OK, semicolon not needed
{
  println("semicolon is optional above")
}

val sample2 = Sample //Error, semicolon is needed
{
  println("semicolon is not optional above")
}

println("Won't work")
