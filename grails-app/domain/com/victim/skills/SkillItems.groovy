package com.victim.skills

class SkillItems {
  String skillItemName
  String description
  SkillType skillType

  static constraints = {
    skillItemName nullable: true, unique: true
    description nullable: true
    skillType nullable: true
  }
}
