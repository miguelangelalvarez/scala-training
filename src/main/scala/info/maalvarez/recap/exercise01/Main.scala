package info.maalvarez.recap.exercise01

/*
Develops a system that allows to store users with at least the next properties:

  - Name
  - Surname
  - Age
  - Affinity with other users
 */
object Main {
  var userManager: UserManager = new UserManager()

  def main(args: Array[String]): Unit = {
    // TODO: create some Users
    val user1: User = new User("David", "Cano", 19)
    val user2: User = new User("Julio", "Cano", 17, Seq(user1))
    val user3: User = new User("Jose Maria", "ENP", 17, Seq(user2))

    userManager = userManager
      .createUser(user1)
      .createUser(user2)
      .createUser(user3)

    // TODO: return adult users (age >= 18)
    println(userManager.getAdultUsers())

    // TODO: return all pair of users with affinity
    println(userManager.getAffinities())

    // TODO: return the properties given an User
    println(userManager.getUser(user3))
  }
}