package com.victim

import com.victim.person.Profile
import com.victim.skills.SkillItems

class Proficiency {
  Profile profile
  SkillItems skillItems
  int level

  static constraints = {
    skillItems nullable: true
    level range: 0..10
  }
}
