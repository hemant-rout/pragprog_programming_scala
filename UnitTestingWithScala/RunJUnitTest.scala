object RunJUnitTest {
  def main(args: Array[String]) =  
    junit.textui.TestRunner.run(classOf[UsingJUnit3Suite])
}
