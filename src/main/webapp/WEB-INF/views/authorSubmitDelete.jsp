<%--
  Created by IntelliJ IDEA.
  User: olga
  Date: 10.10.2020
  Time: 13:06
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
Delete "${author.firstName}" ${author.lastName}"?
<a href="/author/form/main">NO</a>
<a href="/author/form/delete/${id}">DELETE</a>
</body>
</html>
