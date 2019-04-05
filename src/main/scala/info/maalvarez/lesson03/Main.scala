package info.maalvarez.lesson03

object Main {
  def main(args: Array[String]): Unit = {

    /*
    Array:
      - fixed size
      - mutable
      - same type
     */
    val scalaArray: Array[Int] = new Array[Int](5)

    for (index: Int <- 0 until scalaArray.length) {
      scalaArray(index) =  2 * index
    }

    for (content <- scalaArray) {
      println(s"Printing $content")
    }

    /*
    Seq:
      - non-fixed size
      - mutable
     */
    val scalaSeq: Seq[Int] = Seq(0, 1, 2, 3, 4)
scalaSeq.tail()
    for (content <- double(scalaSeq)) {
      println(s"Printing $content")
    }

    /*
    List:
      - non-fixed size
      - immutable
     */
    val scalaList: List[Int] = List(0, 1, 2, 3, 4)

    /*
    Vector:
      - non-fixed size
      - immutable
      - different types
     */
    val scalaVector = Vector(0, 1, 2, 3, "String")
  }

  def double(s: Seq[Int]): Seq[Int] = s match {
    case Seq(x, r @ _*) => (2 * x) +: double(r)
    case _ => s
  }
}