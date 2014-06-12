class AssertionFailureWithMessage extends org.scalatest.Suite {
  def testAssertFailure() {
    assert(2 === List().size, "Unexpected size of List")
  }
}

(new AssertionFailureWithMessage).execute()
