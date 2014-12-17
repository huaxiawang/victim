package com.victim.search

import com.victim.person.Employee

class SearchController {

  def searchUtilService

  def index() {
    String searchText = params.searchText
    List<Employee> matchedEmployees = searchUtilService.search(searchText)
    [matchedEmployees: matchedEmployees]
  }

  def searchResult() {

  }
}
