package info.maalvarez.lesson05

object Main {
  def main(args: Array[String]): Unit = {

    // Sets
    var fruits: Set[String] = Set("Apple", "Banana")

    // Add element
    fruits = fruits + "Orange"
    fruits += "Orange"

    // Add some elements (any Traversable)
    fruits = fruits ++ Set("Orange")
    fruits ++= Set("Orange")

    // Remove element (any Traversable)
    fruits -= "Orange"
    fruits --= Set("Orange")

    // Intersection (any Traversable)
    fruits &= Set("Apple", "Orange")

    // Union (same as addition)
    fruits |= Set("Orange")

    // Difference (any Traversable)
    fruits &~= Set("Apple")

    // Contains
    var exist: Boolean = fruits contains "Orange"
    exist = fruits("Orange")

    // Maps
    var fruitColor: Map[String, String] = Map(
      "Apple" -> "Red",
      "Banana" -> "Yellow")

    // Add element
    fruitColor += "Orange" -> "Orange"

    // Add some elements
    fruitColor ++= Map("Orange" -> "Orange")

    // Remove element
    fruitColor -= "Orange"

    // Remove some elements (any Traversable)
    fruitColor --= Seq("Orange", "Banana")

    // Get value (returns None if it does not exist)
    fruitColor("Orange")

    // Exist key
    fruitColor.contains("Orange")

    // Update
    fruitColor += "Apple" -> "Green"

    // Views
    Seq.range(0, 1000).view
      .map(_ * 2)
      .filter(_ % 2 == 0)

    println(Seq.range(0, 10).par
      .map(_ * 2)
      .filter(_ % 2 == 0)
      .reduce(_ + _))
  }
}
