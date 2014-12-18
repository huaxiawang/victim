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
</head>

<body>
<table>
  <tr>
    <td width="80">Username</td>
    <td><g:textField name="username"/></td>
  </tr>
  <tr>
    <td>Password</td>
    <td><g:textField name="password"/></td>
  </tr>
  <tr>
    <td colspan="2"><g:submitButton name="submit" value="Login"/></td>
  </tr>
</table>
</body>
</html>