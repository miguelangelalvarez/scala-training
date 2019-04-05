package info.maalvarez.lesson02

object Main {
  def main(args: Array[String]): Unit = {
    val optional: Option[String] = Some("hola")

    optional match {
      case Some(value) if value.length  => println(value)
      case None => println("adios")
    }
  }

  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- 0 until n if i + j == v)
      yield (i, j)

  foo(10, 10) foreach {
    case (i, j) =>
      println(s"($i, $j)")  // prints (1, 9) (2, 8) (3, 7) (4, 6) (5, 5) (6, 4) (7, 3) (8, 2) (9, 1)
  }

  foo(10, 10) foreach { tuple =>
    println(s"($tuple._1, $tuple._2) ")  // prints (1, 9) (2, 8) (3, 7) (4, 6) (5, 5) (6, 4) (7, 3) (8, 2) (9, 1)
  }
  1.25 eq 1.25
}

abstract class A {
  val message: String
}
class B extends A {
  val message = "I'm an instance of class B"
}
trait C extends A {
  def loudMessage = message.toUpperCase()
}
class D extends B with C

val d = new D
println(d.message)  // I'm an instance of class B
println(d.loudMessage)  // I'M AN INSTANCE OF CLASS B