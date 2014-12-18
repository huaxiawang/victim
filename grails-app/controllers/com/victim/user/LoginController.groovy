package com.victim.user

class LoginController {

  def index() {
    String errorText = params.errorText
    [errorText: errorText]
  }

  def checkLogin() {
    User user = User.findByUsernameIlikeAndPasswordIlike(params.username, params.password)
    if(user) {
      redirect(controller: "employee", action: "index")
    }
    else {
      redirect(controller: "login", action: "index", params: [errorText: 'Username/Password invalid'])
    }
  }

  def logout() {
    redirect(uri: '/')
  }
}
