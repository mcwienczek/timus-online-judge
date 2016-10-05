import org.scalatest._
import aplusb._

class FirstSpec extends FlatSpec with Matchers {
  "5 plus 10" should "return 15" in {
    var x  = 5
    var y = 10
    Solution.sum(x,y) should be (15)
  }
}