package _1001

import io.Source

object Main extends App {

  val longs = Source.stdin.getLines().flatMap(
    _.split(" ").filter(!_.isEmpty).map(_.toLong)).toArray.reverse

  Solution.reverse_root(longs).foreach(x => println("%.4f".format(x)))

}

object Solution {
  def reverse_root(numbers: Array[Long]): Array[Double] = {
    numbers.map(n => scala.math.sqrt(n))
  }
}