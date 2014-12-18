package com.victim.skills

import org.hibernate.search.annotations.DocumentId
import org.hibernate.search.annotations.Field
import org.hibernate.search.annotations.Index
import org.hibernate.search.annotations.Indexed

@Indexed
class SkillItems {
  @DocumentId
  Long id
  @Field(index=Index.TOKENIZED)
  String skillItemName
  String description
  SkillType skillType

  static constraints = {
    skillItemName nullable: true, unique: true
    description nullable: true
    skillType nullable: true
  }
}
