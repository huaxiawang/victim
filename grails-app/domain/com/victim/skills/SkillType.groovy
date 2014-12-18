package com.victim.skills

class SkillType {
    String skillTypeName

    static constraints = {
      skillTypeName nullable: true
    }

    static hasMany = [items: SkillItems]
}
