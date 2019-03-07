package info.maalvarez

trait Math[A] {
  def sum(x: A, y: A): A
  def sum(x: Tuple[A]): A
  def operate(operation: (A, A) => A, x: A, y: A): A
}
