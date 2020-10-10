<%--
  Created by IntelliJ IDEA.
  User: olga
  Date: 10.10.2020
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="author">
    <form:label path="firstName">First name: </form:label>
    <form:input path="firstName"/>

    <form:label path="lastName">Last name:</form:label>
    <form:input path="lastName"/>

    <form:button type="submet">Save</form:button>
</form:form>
</body>
</html>
