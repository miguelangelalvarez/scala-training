package info.maalvarez.recap.exercise01

final case class User(name: String, surname: String, age: Int, affinity: Seq[User] = Nil)

object User {
  def apply(name: String, surname: String, age: Int, affinity: Seq[User]): User = new User(name, surname, age, affinity)
  def unapply(arg: User): Option[(String, String, Int, Seq[User])] = {
    val tuple: (String, String, Int, Seq[User]) = (arg.name, arg.surname, arg.age, arg.affinity)

    Some(tuple)
  }
}