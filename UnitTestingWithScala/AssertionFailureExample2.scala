class AssertionFailureExample2 extends org.scalatest.Suite {
  def testAssertFailure() {
    assert(2 === List().size)
  }
}

(new AssertionFailureExample2).execute()
