<%--
  Created by IntelliJ IDEA.
  User: olga
  Date: 09.10.2020
  Time: 16:32
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
edit here


<form:form modelAttribute="book" method="post">

    <form:label path="title">Title: </form:label>
    <form:input path="title" />

    <form:label path="description">Description:</form:label>
    <form:input path="description"/>

    <form:label path="publisher">Publisher</form:label>
    <form:select path="publisher.id" items="${publishers}" itemLabel="name" itemValue="id"/>

    <form:button type="submit">Save</form:button>
</form:form>
</body>
</html>
