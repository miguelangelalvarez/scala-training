package info.maalvarez.lesson01

object Main {
  def main(args: Array[String]): Unit = {
    printMessage("Good morning!")

    val a: MathInt = new MathInt()
    a.factorial(10)
  }

  def printMessage(s: String) = println("Good morning!")
}