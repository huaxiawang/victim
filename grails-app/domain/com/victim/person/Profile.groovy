package com.victim.person

import com.victim.Proficiency
import com.victim.skills.SkillType
import org.hibernate.search.annotations.DocumentId
import org.hibernate.search.annotations.Indexed
import org.hibernate.search.annotations.IndexedEmbedded

@Indexed
class Profile {
  @DocumentId
  Long id
  @IndexedEmbedded
  Employee employee

  static constraints = {
  }

  static hasMany = [type: SkillType, proficiency: Proficiency]
}
