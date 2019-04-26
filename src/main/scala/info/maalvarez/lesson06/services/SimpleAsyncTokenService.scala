package info.maalvarez.lesson06.services

import info.maalvarez.lesson06.model.{Credentials, UserToken}

import scala.concurrent.Future

trait SimpleAsyncTokenService {
  def requestToken(credentials: Credentials): Future[UserToken]
}
