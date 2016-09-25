<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>User barter</title>
</head>
<body>
<section>
<h2><a href="index.html">Home</a></h2>
<h2>User barter</h2>
<a href="desires?action=create">Add barter</a>
<hr>
<table border="1" cellpadding="8" cellspacing="0">
    <thead>
    <tr>
        <th>Date</th>
        <th>Desire</th>
        <th>Barter</th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <c:forEach items="${desireList}" var="barter">
        <jsp:useBean id="barter" scope="page" type="dreamco.project.model.Desire"/>
        <tr>
            <td>${barter.dateTime.toLocalDate()} ${barter.dateTime.toLocalTime()}</td>
            <td>${barter.desireDescription}</td>
            <td>${barter.barterPropose}</td>
            <td><a href="desires?action=update&id=${barter.id}">Update</a> </td>
            <td><a href="desires?action=delete&id=${barter.id}">Delete</a> </td>
        </tr>
    </c:forEach>
</table>
</section>
</body>
</html>
