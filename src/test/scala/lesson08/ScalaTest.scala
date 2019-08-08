package lesson08

import org.scalatest.tagobjects.Slow
import org.scalatest.{FlatSpec, Tag}

class ScalaTest {

  /*
  Styles:
    - FunSuite
    * FlatSpec
    - FunSpec
    * WordSpec
    - FreeSpec
    - PropSpec
    - FeatureSpec
    - RefSpec (JVM only)

    http://www.scalatest.org/user_guide/selecting_a_style
   */

  /*
  Recommendations:

  - Base abstract class with traits: at least Matchers
  - Use before and after
   */

  /*
  - assert(boolean expression, message)
  - assertResult(expected, message) {...}
  - fail(message)
  - assertThrows[exception] {...}
  - val caught = intercept[exception] {...}
  - assume(boolean expression)
  - cancel(message)
  - withClue(message) {
      assertThrows[excpetion] {...}
    }
   */

  /*
  - ignore
  - tagging
   */

  object DbTest extends Tag("info.maalvarez.lesson08.DbTest")

  class ExampleSpec extends FlatSpec {

    "The Scala language" must "add correctly" taggedAs(Slow) in {
      val sum = 1 + 1
      assert(sum === 2)
    }

    ignore must "subtract correctly" taggedAs(Slow, DbTest) in {
      val diff = 4 - 1
      assert(diff === 3)
    }
  }

  /*
  Fixtures: http://www.scalatest.org/user_guide/sharing_fixtures
  Mocking: http://www.scalatest.org/user_guide/testing_with_mock_objects#mockito
  Invariant: http://www.scalatest.org/user_guide/property_based_testing
  Asynchronous: http://www.scalatest.org/user_guide/async_testing
   */

  /*
  - Inside
  - OptionValues
  - EitherValues
  - PartialFunctionValues
  - PrivateMethodTest
  - WrapWith
   */
}
