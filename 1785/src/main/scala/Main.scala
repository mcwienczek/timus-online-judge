import scala.io.Source

object Main extends App {
  var input = io.StdIn.readInt()

  input match {
    case x if x <= 4 => println("few")
    case x if x <= 9 => println("several")
    case x if x <= 19 => println("pack")
    case x if x <= 49 => println("lots")
    case x if x <= 99 => println("horde")
    case x if x <= 249 => println("throng")
    case x if x <= 499 => println("swarm")
    case x if x <= 999 => println("zounds")
    case _ => println("legion")

  }
}