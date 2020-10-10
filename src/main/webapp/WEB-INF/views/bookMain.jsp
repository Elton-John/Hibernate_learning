<%--
  Created by IntelliJ IDEA.
  User: olga
  Date: 09.10.2020
  Time: 14:32
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
books:


<table>
    <tr>
        <th>ID</th>
        <th>TITLE</th>
        <th>DESCRIPTION</th>
        <th>PUBLISHER</th>
        <th>AUTHOR</th>
        <th>EDIT</th>
        <th>DELETE</th>

    </tr>
    <c:forEach var="book" items="${books}">
    <tr>
        <td>${book.id}</td>
        <td>${book.title}</td>
        <td>${book.description}</td>
        <td>${book.publisher.name}</td>
<%--        <td>${book.authorList} </td>--%>
        <td><a href="edit/${book.id}"> EDIT</a></td>
        <td><a href="delete/submit/${book.id}"> DELETE</a></td>
    <tr>
        </c:forEach>
</table>

<h1>
<a href="add">ADD NEW BOOK</a>
</h1>

<%--<c:forEach items="${books}" var="book">--%>
<%--   <p>${book.id} ${book.title} ${book.description} </p>--%>
<%--</c:forEach>--%>


</body>
</html>
