package com.victim.user

/**
 * TODO: Explain This
 *
 * Created by hchandra on 12/17/14.
 */
class User {
  String username
  String password

  static constraints = {
    username blank: false
    password blank: false
  }
}
