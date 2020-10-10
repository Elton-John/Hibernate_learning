<%--
  Created by IntelliJ IDEA.
  User: olga
  Date: 10.10.2020
  Time: 10:09
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
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>LAST NAME</th>
        <th>EDIT</th>
        <th>DELETE</th>

    </tr>
    <c:forEach var="author" items="${authors}">
    <tr>
        <td>${author.id}</td>
        <td>${author.firstName}</td>
        <td>${author.lastName}</td>
        <td><a href="edit/${author.id}"> EDIT</a></td>
        <td><a href="delete/submit/${author.id}"> DELETE</a></td>
    <tr>
        </c:forEach>
</table>

<h1>
    <a href="add">ADD NEW AUTHOR</a>
</h1>
</body>
</html>
