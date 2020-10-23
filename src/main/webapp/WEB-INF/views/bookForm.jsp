<%--
  Created by IntelliJ IDEA.
  User: olga
  Date: 09.10.2020
  Time: 14:22
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
<form:form modelAttribute="book" method="post">
    <p>
    <form:label path="title">Title: </form:label>
    <form:input path="title"/>
    </p><p>
    <form:label path="description">Description:</form:label>
    <form:input path="description"/>
</p><p>
    <form:label path="publisher">Publisher</form:label>
    <form:select path="publisher.id" items="${publishers}" itemLabel="name" itemValue="id"/>
</p><p>
    <form:label path="authorList">Author</form:label>
    <form:select path="authorList" items="${authors}" itemLabel="lastName" itemValue="id"/>

    <a href="/author/form/main"> Can't find? Add new author</a>
</p><p>
    <form:button type="submit">Save</form:button>
</p>
</form:form>

</body>
</html>
