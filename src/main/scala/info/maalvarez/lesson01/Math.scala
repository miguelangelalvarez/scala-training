package info.maalvarez.lesson01

trait Math[A] {
  def sum(x: A, y: A): A
  def sum(x: Tuple[A]): A
  def operate(operation: (A, A) => A, x: A, y: A): A
}
