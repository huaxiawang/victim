package com.victim.search

import com.victim.Proficiency

class SearchController {

  def searchUtilService

  def index = {
    String searchText = params.searchText
    if(!searchText?.trim()) {
      return [:]
    }
    def page = [max: Math.min(params.max? params.int('max'): 10, 50), offset: params.offset ? params.int('offset') : 0]

    def matchedProficiency = Proficiency.search().list{
      should {
        searchText.tokenize().each { keyword ->
          def wild = '*' + keyword.toLowerCase() + '*'

          wildcard "profile.employee.firstName", wild
          wildcard "profile.employee.lastName", wild
          wildcard "skillItems.skillItemName", wild
        }
      }

      sort "level", "desc"

      maxResults page.max

      offset page.offset
    }

    def matchedEmployees = []
    matchedProficiency.each{
      if(!matchedEmployees.contains(it.profile.employee))
        matchedEmployees << it.profile.employee
    }

    [matchedEmployees: matchedEmployees]
  }

  def searchResult() {

  }
}
