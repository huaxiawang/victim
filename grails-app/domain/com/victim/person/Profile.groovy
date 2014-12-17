package com.victim.person

import com.victim.Proficiency
import com.victim.skills.SkillType

class Profile {
  Employee employee
  static constraints = {
  }

  static hasMany = [type: SkillType, proficiency: Proficiency]
}
