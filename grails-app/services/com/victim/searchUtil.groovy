package com.victim

import com.victim.person.Employee
import com.victim.skills.SkillItems

/**
 * TODO: Explain This
 *
 * Created by hwang on 12/17/14.
 */
class searchUtil {
  List<Employee> search(String skill){
    List<Employee> results = []

    def item = SkillItems.findBySkillItemNameIlike("%$skill%")
    List<Proficiency> proficiencies = Proficiency.findAllBySkillItems(item, [sort: "level", order: "desc"])
    proficiencies.each {results << it.profile.employee}

    return results
  }
}
