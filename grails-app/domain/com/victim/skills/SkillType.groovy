package com.victim.skills

import com.victim.person.Profile

class SkillType {
    String skillTypeName
    Profile profile

    static constraints = {
      skillTypeName nullable: true
    }

    static hasMany = [items: SkillItems]
}
