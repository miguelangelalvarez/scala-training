package info.maalvarez.lesson03

object Main {
  def main(args: Array[String]): Unit = {

    /*
    Array example
      - fixed size
      - same type
      - mutable
     */
    val scalaArray: Array[Int] = new Array[Int](5)

    for (index: Int <- 0 to scalaArray.length - 1) {
      scalaArray(index) = 2 * index
    }

    for (content <- scalaArray) {
      println(s"Printing $content")
    }

    /*
    Sequence example
      - same type
      - mutable**
     */
    val scalaSeq: Seq[Int] = Seq(0, 1, 2, 3, 4)
    // (0 until 5).toSeq
    // Seq.range(0, 5)

    // :+
    // ++
    // +:
    // ++:

    for (content <- double(scalaSeq)) {
      println(s"Printing $content")
    }

    /*
    List example
      - same type
      - immutable
     */

    // ::

    /*
    Vector example
      - different types
      - immutable
     */
  }

  def double(s: Seq[Int]): Seq[Int] = s match {
    case Seq(x, xs @ _*) => (x * 2) +: double(xs)
    case _ => Seq.empty[Int]
  }

  // Look for performance

  // ArrayList -> scala.collection.mutable.ArrayBuffer
}
