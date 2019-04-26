package info.maalvarez.lesson04

import java.net.{MalformedURLException, URL}

import scala.util.{Failure, Success, Try}

object Main {
  final case class MyException(msg: String) extends Exception(msg)

  def main(args: Array[String]): Unit = {


    // Simple way
    try {
      new URL("https://www.google.es")

      throw new MyException("hola")
    } catch {
      case _: MalformedURLException => println("url mala")
      case MyException(msg) => println(msg)
      case _ => println("otra cosa")
    } finally {

    }

    // Functional way
    val url: Try[URL] = Try(new URL("https://www.google.es"))
    url.map(value => value).get

    url match {
      case Success(value) => println(value)
      case Failure(exception) => exception.printStackTrace()
    }

    // More functional way
    val url2: Try[URL] = for {
      url <- Try(new URL("https://www.google.es"))
      hola <- Try(new URL(url.getHost))
    } yield hola
  }
}
