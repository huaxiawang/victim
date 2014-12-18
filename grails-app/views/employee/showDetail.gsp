<%--
  Created by IntelliJ IDEA.
  User: hchandra
  Date: 12/17/14
  Time: 4:36 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <meta name="layout" content="main">
</head>

<body>
  <div id="employeeDetailHeader">Employee Detail</div>
  <div>
    <g:set var="employee" value="${employee}"/>
    <table>
      <tr>
        <td rowspan="2" width="150"> <asset:image src="favicon.ico" width="120" height="80"/> </td>
        <td> Name : ${employee.firstName}&nbsp;${employee.lastName} </td>
      </tr>
      <tr>
        <td>Skill Items : ${employee.profile.proficiency.skillItems.skillItemName}</td>
      </tr>
    </table>
  </div>
  <div id="detailedInformation">
    <g:each in="${employee.profile.type}" var="skillTypes">
      <table>
        <tr>
          <td><div id="skillTypeDecorator">${skillTypes.skillTypeName}</div></td>
        </tr>
        <tr>
          <td>
            <table>
              <tr>
                <th>Skill Item</th>
                <th>Proficiency</th>
              </tr>
              <g:each in="${employee.profile.proficiency}" var="proficiency">
                <g:set value="${proficiency.skillItems}" var="skillItems"/>
                <g:if test="${skillItems.skillType.skillTypeName == skillTypes.skillTypeName}">
                  <tr>
                    <td>${skillItems.skillItemName}</td>
                    <td>${proficiency.level}</td>
                  </tr>
                </g:if>
              </g:each>
            </table>
          </td>
        </tr>
      </table>
    </g:each>
  </div>
</body>
</html>