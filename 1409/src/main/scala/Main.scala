import scala.io.Source

object Main extends App {
  // n - total cans at the beginning
  // x - cans chots by Harry
  // y - cans shot by Larry
  // n = x + y - 1
  // xx - cans not shot by harry
  // xx = n - x
  // yy - cans not shot by Larry
  // yy = n - y

  val Array(x,y) = readLine.split(" ").map(_.toInt)

  var n = x + y - 1

  var xx = n - x
  var yy = n - y

  println(xx + " " + yy)
}