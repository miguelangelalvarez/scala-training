package info.maalvarez.lesson01.exercise

final case class State(screen: Double, memory: Double, op: Operation)

final case class Action(state: State, operation: Operation)

sealed trait Operation

case object NoOperation extends Operation
case object Addition extends Operation
case object Subtraction extends Operation
case object Multiplication extends Operation
case object Division extends Operation

trait Calculator {
  def reset(): State
  def insertNumber(number: Double, state: State): State
  def applyOperation(op: Operation, state: State): State
  def getResult(state: State): Double
}

object CalculatorImpl extends Calculator {
  override def reset(): State = State(0, 0, Addition)

  override def insertNumber(number: Double, state: State): State =
    state.op match {
      case Addition => State(state.screen + number, state.screen, state.op)
      case Subtraction => State(state.screen - number, state.screen, state.op)
      case Multiplication => State(state.screen* number, state.screen, state.op)
      case Division => State(state.screen / number, state.screen, state.op)
      case _ => throw new IllegalStateException()
    }

  override def applyOperation(op: Operation, state: State): State =
    State(state.screen, state.memory, op)

  override def getResult(state: State): Double = state.screen
}