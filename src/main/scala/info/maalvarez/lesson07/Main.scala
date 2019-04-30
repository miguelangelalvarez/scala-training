package info.maalvarez.lesson07

import io.circe._
import io.circe.parser._
import io.circe.syntax._
import io.circe.generic.auto._
import io.circe.generic.semiauto._

case class Person(name: String)
case class Greeting(salutation: String, person: Person, exclamationMarks: Int)

case class Foo(a: Int, b: String, c: Boolean)

object Main {
  implicit val fooDecoder: Decoder[Foo] = deriveDecoder
  implicit val fooEncoder: Encoder[Foo] = deriveEncoder

  def main(args: Array[String]): Unit = {
    val rawJson: String = """{
        "foo": "bar",
        "baz": 123,
        "list of stuff": [ 4, 5, 6 ]
      }"""

    val parseResult = parse(rawJson)

    parseResult match {
      case Left(_) => println("Invalid JSON :(")
      case Right(_) => println("Yay, got some JSON!")
    }


    //////////////////////////////////////////////////

    val intsJson = List(1, 2, 3).asJson

    println(intsJson)

    intsJson.as[List[Int]] match {
      case Right(value) => println(value)
    }

    //////////////////////////////////////////////////

    Greeting("Hey", Person("Chris"), 3).asJson.as[Greeting] match {
      case Right(value) => println(s"HOLAAAAA: $value")
    }

    //////////////////////////////////////////////////

    println(Foo(1, "a", true).asJson.as[Foo])
  }
}