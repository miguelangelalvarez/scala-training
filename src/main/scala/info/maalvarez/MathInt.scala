package info.maalvarez

class MathInt extends Math[Int] {
  val product: (Int, Int) => Int = (x: Int, y: Int) => x * y
  val divide: (Int, Int) => Int = (x: Int, y: Int) => x / y

  def sum(a: Int, b: Int): Int = a + b
  def sum(tuple: Tuple[Int]): Int = sum(tuple.first, tuple.second)
  def operate(operation: (Int, Int) => Int, x: Int, y: Int): Int = operation(x, y)
  def factorial(n: Int) = if (n == 0) 1 else n * factorial(n - 1)
}

object MathInt {
  def apply: MathInt = new MathInt()
}