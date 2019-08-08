name := "scala-training"
organization := "maalvarez.info"

version := "0.1"
scalaVersion := "2.12.8"

val Versions = new {
  val Circe = "0.10.0"
  val ScalaTest = "3.0.8"
}

val dependencies: Seq[ModuleID] = List(
  "io.circe" %% "circe-core" % Versions.Circe,
  "io.circe" %% "circe-parser" % Versions.Circe,
  "io.circe" %% "circe-generic" % Versions.Circe
)

val testDependencies: Seq[ModuleID] = List(
  "org.scalatest" %% "scalatest" % Versions.ScalaTest
).map(_ % "test")

libraryDependencies ++= dependencies ++ testDependencies