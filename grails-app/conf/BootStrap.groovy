import com.victim.Proficiency
import com.victim.person.Employee
import com.victim.person.Profile
import com.victim.skills.SkillItems
import com.victim.skills.SkillType

class BootStrap {

    def init = { servletContext ->

      def profile1 = new Profile()
      def employee1 = new Employee(firstName: "Huaxia", lastName: "Wang")
      employee1.save(flush: true, failOnError: true)
      profile1.employee = employee1
      profile1.save(flush: true, failOnError: true)
      employee1.profile = profile1
      employee1.save(flush: true, failOnError: true)

      def skillType1 = new SkillType(skillTypeName: "language")
      def skillType2 = new SkillType(skillTypeName: "platform")
      skillType1.save(flush: true, failOnError: true)
      skillType2.save(flush: true, failOnError: true)

      profile1.addToType(skillType1)
      profile1.addToType(skillType2)
      profile1.save(flush: true, failOnError: true)

      def skillItem1 = new SkillItems(skillItemName: "c++", skillType: skillType1, description: "blablabla")
      def skillItem2 = new SkillItems(skillItemName: "java", skillType: skillType1, description: "blablabla")
      def skillItem3 = new SkillItems(skillItemName: "windows", skillType: skillType2, description: "blablabla")
      def skillItem4 = new SkillItems(skillItemName: "linux", skillType: skillType2, description: "blablabla")
      skillItem1.save(flush: true, failOnError: true)
      skillItem2.save(flush: true, failOnError: true)
      skillItem3.save(flush: true, failOnError: true)
      skillItem4.save(flush: true, failOnError: true)

      def proficiency1 = new Proficiency(profile: profile1, skillItems: skillItem1, level: 0)
      def proficiency2 = new Proficiency(profile: profile1, skillItems: skillItem2, level: 0)
      def proficiency3 = new Proficiency(profile: profile1, skillItems: skillItem3, level: 0)
      def proficiency4 = new Proficiency(profile: profile1, skillItems: skillItem4, level: 0)
      proficiency1.save(flush: true, failOnError: true)
      proficiency2.save(flush: true, failOnError: true)
      proficiency3.save(flush: true, failOnError: true)
      proficiency4.save(flush: true, failOnError: true)

      def profile2 = new Profile()
      def employee2 = new Employee(firstName: "Hardi", lastName: "Chandra")
      employee2.save(flush: true, failOnError: true)
      profile2.employee = employee2
      profile2.save(flush: true, failOnError: true)
      employee2.profile = profile2
      employee2.save(flush: true, failOnError: true)

      profile2.addToType(skillType1)
      profile2.addToType(skillType2)
      profile2.save(flush: true, failOnError: true)

      def proficiency5 = new Proficiency(profile: profile2, skillItems: skillItem1, level: 7)
      def proficiency6 = new Proficiency(profile: profile2, skillItems: skillItem2, level: 8)
      def proficiency7 = new Proficiency(profile: profile2, skillItems: skillItem3, level: 9)
      proficiency5.save(flush: true, failOnError: true)
      proficiency6.save(flush: true, failOnError: true)
      proficiency7.save(flush: true, failOnError: true)

    }
    def destroy = {
    }
}
