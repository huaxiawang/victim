package com.victim

import com.victim.person.Profile
import com.victim.skills.SkillItems
import org.hibernate.search.annotations.DocumentId
import org.hibernate.search.annotations.Field
import org.hibernate.search.annotations.Index
import org.hibernate.search.annotations.Indexed
import org.hibernate.search.annotations.IndexedEmbedded

@Indexed
class Proficiency {
  @DocumentId
  Long id
  @IndexedEmbedded(depth=2)
  Profile profile
  @IndexedEmbedded
  SkillItems skillItems
  @Field(index= Index.UN_TOKENIZED)
  int level

  static constraints = {
    skillItems nullable: true
    level range: 0..10
  }
}
