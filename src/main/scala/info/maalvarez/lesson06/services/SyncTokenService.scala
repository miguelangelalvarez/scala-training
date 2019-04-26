package info.maalvarez.lesson06.services

import info.maalvarez.lesson06.model.{Credentials, User, UserToken}

trait SyncTokenService {
  protected def authenticate(credentials: Credentials): User
  protected def issueToken(user: User): UserToken

  def requestToken(credentials: Credentials): UserToken =
    issueToken(authenticate(credentials))
}
