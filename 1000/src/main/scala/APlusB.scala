package aplusb

import io.Source

object Main extends App {

    var numbers = scala.io.StdIn.readLine().split(" ").filter(!_.isEmpty).map(_.toLong).toArray

    println(Solution.sum(numbers(0), numbers(1)))
}

object Solution {
  def sum(a:Long, b:Long) = a + b
}