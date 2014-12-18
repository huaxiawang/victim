package com.victim.person

import org.hibernate.search.annotations.DocumentId
import org.hibernate.search.annotations.Field
import org.hibernate.search.annotations.Index
import org.hibernate.search.annotations.Indexed

@Indexed
class Employee {
  @DocumentId
  Long id
  @Field(index=Index.TOKENIZED)
  String firstName
  @Field(index=Index.TOKENIZED)
  String lastName

  Profile profile

  static constraints = {
    firstName nullable: true
    lastName nullable: true
    profile nullable: true
  }
}
