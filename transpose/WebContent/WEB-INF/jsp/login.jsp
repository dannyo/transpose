<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
</head>
<body>
<form:form action="handleLogin" method="post" commandName="user">
    <table border="0" align="center">
        <tr>
            <td>User Name: </td>
            <td><form:input path="login" /></td>
        </tr>
        <tr>
            <td>Password: </td>
            <td><form:password path="password" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>   
</body>
</html>