package com.victim.person

class Employee {
  String firstName
  String lastName

  Profile profile

  static constraints = {
    firstName nullable: true
    lastName nullable: true
    profile nullable: true
  }
}
