<%--
  Created by IntelliJ IDEA.
  User: hchandra
  Date: 12/17/14
  Time: 6:24 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <asset:stylesheet src="main.css"/>
  <meta name="layout" content="main">
</head>

<body>
  <g:form controller="login" action="checkLogin">
    <div id="loginPage">
      <table>
        <tr>
          <td width="80">Username</td>
          <td><g:textField name="username"/></td>
        </tr>
        <tr>
          <td>Password</td>
          <td><g:passwordField name="password"/></td>
        </tr>
        <g:if test="${errorText}">
          <tr>
            <td colspan="2" id="errorText">${errorText}</td>
          </tr>
        </g:if>
        <tr>
          <td colspan="2"><g:submitButton name="submit" value="Login"/></td>
        </tr>
      </table>
    </div>
  </g:form>
</body>
</html>