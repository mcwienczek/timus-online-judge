import scala.io.Source

object Main {
  def main(args: Array[String]): Unit = {
    //12 problems total
    //5 hours total
    //next 4 hours for 5 problems

    var f = scala.io.StdIn.readInt()

    if(12 - f <= 5){
      println("YES")
      return
    }
    println("NO")
  }
}