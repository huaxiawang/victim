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
      <asset:image id="smallLogo" src="victim/logo.png"/>
      <input type="text" name="searchText" id="searchText" value="${params.searchText}"/>
      <input type="submit" name="doSearch" id="doSearch" value="search" />
    </div>
  </g:form>

  <g:each in="${matchedEmployees}" var="matchedEmployee">
    <div id="searchResultRow">
      <table>
        <tr rowspan="2">
          <td><asset:image src="favicon.ico" width="120" height="40"/></td>
          <td>${matchedEmployee.firstName} ${matchedEmployee.lastName}</td>
        </tr>
      </table>
    </div>
  </g:each>
</body>
</html>