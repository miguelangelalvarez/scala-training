package info.maalvarez.lesson06

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

case class GrindingException(msg: String) extends Exception(msg)
case class FrothingException(msg: String) extends Exception(msg)
case class WaterBoilingException(msg: String) extends Exception(msg)
case class BrewingException(msg: String) extends Exception(msg)

object Coffee {
  type CoffeeBeans = String
  type GroundCoffee = String
  case class Water(temperature: Int)
  type Milk = String
  type FrothedMilk = String
  type Espresso = String
  type Cappuccino = String

  def grind(beans: CoffeeBeans): Future[GroundCoffee] = Future {
    s"ground coffee of $beans"
  }

  def heatWater(water: Water): Future[Water] = Future {
    water.copy(temperature = 85)
  }

  def frothMilk(milk: Milk): Future[FrothedMilk] = Future {
    s"frothed $milk"
  }

  def brew(coffee: GroundCoffee, heatedWater: Water): Future[Espresso] = Future {
    "espresso"
  }

  def combine(espresso: Espresso, frothedMilk: FrothedMilk): Cappuccino = "cappuccino"

  def prepareCappuccino(): Future[Cappuccino] = {
    val groundCoffee: Future[GroundCoffee] = grind("arabica beans")
    val hotWater: Future[Water] = heatWater(Water(25))
    val hotMilk: Future[FrothedMilk] = frothMilk("milk")

    for {
      ground <- groundCoffee
      water <- hotWater
      foam <- hotMilk
      espresso <- brew(ground, water)
    } yield combine(espresso, foam)
  }
}