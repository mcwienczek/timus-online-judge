import scala.io.Source

object Main extends App {
  //scala.io.StdIn.readLine().split(" ").filter(!_.isEmpty).map(_.toLong).toArray
  var input = scala.io.StdIn.readLine().split(" ").filter(!_.isEmpty).map(_.toInt).toArray

  println(input(0) * input(1) * input(2) * 2)
}