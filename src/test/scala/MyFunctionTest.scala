import org.scalatest.funsuite.AnyFunSuite

class MyFunctionTest extends AnyFunSuite {
  test("MyFunction should return the correct output") {
    val mycl = new MyFunction()
    assert(mycl.calculate(2) == 4, "Test case failed: calculate(2) did not return 4")
    assert(mycl.calculate(0) == 0, "Test case failed: calculate(0) did not return 0")
    // Add more test cases...

    // Custom success message (optional)
    println("All test cases passed successfully")
  }
}

