import com.victim.Proficiency
import com.victim.person.Employee
import com.victim.person.Profile
import com.victim.skills.SkillItems
import com.victim.skills.SkillType

class BootStrap {

    def init = { servletContext ->

      def profile1 = new Profile()
      def employee1 = new Employee(firstName: "Huaxia", lastName: "Wang")
      profile1.employee = employee1
      profile1.save(flush: true, failOnError: true)
      employee1.profile = profile1
      employee1.save(flush: true, failOnError: true)

      def skillType1 = new SkillType(skillTypeName: "language", profile: profile1)
      def skillType2 = new SkillType(skillTypeName: "platform", profile: profile1)
      skillType1.save(flush: true, failOnError: true)
      skillType2.save(flush: true, failOnError: true)

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
      profile2.employee = employee2
      profile2.save(flush: true, failOnError: true)
      employee2.profile = profile2
      employee2.save(flush: true, failOnError: true)

      def skillType3 = new SkillType(skillTypeName: "language", profile: profile2)
      def skillType4 = new SkillType(skillTypeName: "platform", profile: profile2)
      skillType3.save(flush: true, failOnError: true)
      skillType4.save(flush: true, failOnError: true)

      def skillItem5 = new SkillItems(skillItemName: "groovy", skillType: skillType3, description: "blablabla")
      def skillItem6 = new SkillItems(skillItemName: "java", skillType: skillType3, description: "blablabla")
      def skillItem7 = new SkillItems(skillItemName: "windows", skillType: skillType4, description: "blablabla")
      def skillItem8 = new SkillItems(skillItemName: "linux", skillType: skillType4, description: "blablabla")
      skillItem5.save(flush: true, failOnError: true)
      skillItem6.save(flush: true, failOnError: true)
      skillItem7.save(flush: true, failOnError: true)
      skillItem8.save(flush: true, failOnError: true)

      def proficiency5 = new Proficiency(profile: profile2, skillItems: skillItem5, level: 10)
      def proficiency6 = new Proficiency(profile: profile2, skillItems: skillItem6, level: 10)
      def proficiency7 = new Proficiency(profile: profile2, skillItems: skillItem7, level: 10)
      def proficiency8 = new Proficiency(profile: profile2, skillItems: skillItem8, level: 10)
      proficiency5.save(flush: true, failOnError: true)
      proficiency6.save(flush: true, failOnError: true)
      proficiency7.save(flush: true, failOnError: true)
      proficiency8.save(flush: true, failOnError: true)

    }
    def destroy = {
    }
}
