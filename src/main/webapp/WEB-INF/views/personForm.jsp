<%--
  Created by IntelliJ IDEA.
  User: olga
  Date: 09.10.2020
  Time: 08:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="person">
    <label>login</label>
    <form:input type="text" path="login"/>
    <label>password</label>
    <form:input type="password" path="password"/>
    <form:button type="submit">save</form:button>
</form:form>
</body>
</html>
