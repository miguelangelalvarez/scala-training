package info.maalvarez.recap.exercise01

class UserManager(users: Seq[User] = Nil) {
  private val AdultAge: Int = 18

  def createUser(user: User): UserManager = user match {
    case u: User => new UserManager(users :+ u)
  }

  def getAdultUsers(): Seq[User] =
    users.filter(u => u.age >= AdultAge)

  def getAffinities(): Seq[(String, String)] =
    for {
      user <- users
      friend <- user.affinity
    } yield (user.name, friend.name)

  def getUser(user: User): (String, String, Int, Seq[User]) = {
    // Option 1
    User.unapply(user) match {
      case Some(u) => u
    }

    // Option 2
    val User(name, surname, age, affinity) = user

    (name, surname, age, affinity)
  }
}
