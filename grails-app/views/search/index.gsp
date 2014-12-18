<%--
  Created by IntelliJ IDEA.
  User: hchandra
  Date: 12/17/14
  Time: 2:51 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <asset:stylesheet src="main.css"/>
</head>

<body>
  <g:form url='[controller: "search", action: "index"]'>
    <div>
      <a href="/victim"><asset:image id="smallLogo" src="victim/logo.png"/></a>
      </div>
    <div>
      <input type="text" name="searchText" id="searchText" value="${params.searchText}"/>
      <input type="submit" name="doSearch" id="doSearch" value="search" />
    </div>
  </g:form>


    <div id="searchResultRow">
      <table width="1000" border="0">
        <g:each in="${matchedEmployees}" var="matchedEmployee">
          <tr>
            <td rowspan="2" width="150">
              <g:link controller="employee" action="showDetail" id="${matchedEmployee.id}" params="[id: matchedEmployee.id]">
                <asset:image src="favicon.ico" width="120" height="100"/>
              </g:link>
            </td>
            <td height="1">
              <g:link controller="employee" action="showDetail" id="${matchedEmployee.id}" params="[id: matchedEmployee.id]">
                Name : ${matchedEmployee.firstName}&nbsp;${matchedEmployee.lastName}
              </g:link>
            </td>
          </tr>
          <tr>
            <td>Skill Items : ${matchedEmployee.profile.proficiency.skillItems.skillItemName}</td>
          </tr>
        </g:each>
      </table>
    </div>
</body>
</html>