import scala.io.Source

object Main {
  def main(args: Array[String]): Unit = {
    var number1 = scala.io.StdIn.readLine.trim.toInt
    var number2 = scala.io.StdIn.readLine.trim.toInt
    if(number1 % 2 == 0) {
      println("yes")
      return
    }
    if(number2 % 2 == 1) {
      println("yes")
      return
    }

    println("no")
  }
}