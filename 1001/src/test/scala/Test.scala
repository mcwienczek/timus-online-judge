import org.scalatest._
import _1001._


class Test extends FlatSpec with Matchers {
  "Root of 16" should "return 4" in {
    val input = new Array[Long](1)
    var output = new Array[Double](1)
    input(0) = 16
    output(0) = 4.0
    Solution.reverse_root(input) should be (output)
  }
}