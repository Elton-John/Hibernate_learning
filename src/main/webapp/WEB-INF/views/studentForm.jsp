<%--
  Created by IntelliJ IDEA.
  User: olga
  Date: 09.10.2020
  Time: 10:43
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
<form:form method="post" modelAttribute="student">
    <form:label path="firstName">first name: </form:label>
    <form:input path="firstName"/>
    <form:label path="lastName">last name: </form:label>
    <form:input path="lastName"/>

    <form:label path="gender">gender: </form:label>
    M<form:radiobutton path="gender" value="M"/>
    F<form:radiobutton path="gender" value="F"/>

    <form:label path="country">country</form:label>
    <form:select path="country">
        <form:option value="-" label="--Please Select--"/>
        <form:options items="${countries}"/>
    </form:select>

    <form:label path="notes">notes:</form:label>
    <form:textarea path="notes"/>

    <form:label path="mailingList">add to mailing list </form:label>
    <form:checkbox path="mailingList"/>

    <form:label path="programmingSkills">programming skills:</form:label>
    <form:select path="programmingSkills" multiple="true">
        <form:option value="-" label="--Please Select--"/>
        <form:options items="${skills}"/>
    </form:select>

    <form:label path="hobbies">hobbies: </form:label>
    <form:checkboxes path="hobbies" items="${hobbies}"/>

    <form:button type="submit">save</form:button>
</form:form>
</body>
</html>
