package info.maalvarez.lesson02

import scala.util.{Random => A}

object CustomerID {

  def apply(name: String) = s"$name--${A.nextLong}"

  def unapply(customerID: String): Option[String] = {
    val stringArray: Array[String] = customerID.split("--")
    if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
  }
}
