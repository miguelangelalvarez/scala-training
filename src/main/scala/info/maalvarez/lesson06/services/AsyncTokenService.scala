package info.maalvarez.lesson06.services

import info.maalvarez.lesson06.model.{Credentials, User, UserToken}

import scala.concurrent.Future

import scala.concurrent.ExecutionContext.Implicits.global

trait AsyncTokenService {
  protected def authenticate(credentials: Credentials): Future[User]
  protected def issueToken(user: User): Future[UserToken]

  def requestToken(credentials: Credentials): Future[UserToken] =
    authenticate(credentials).flatMap(user => issueToken(user))
}
