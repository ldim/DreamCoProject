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
<hr>
<table border="1" cellpadding="8" cellspacing="0">
    <thead>
    <tr>
        <th>Date</th>
        <th>Desire</th>
        <th>Barter</th>
    </tr>
    </thead>
    <c:forEach items="${userList}" var="barter">
        <jsp:useBean id="barter" scope="page" type="dreamco.project.model.UserDesire"/>
        <tr>
            <td>${barter.dateTime.toLocalDate()} ${barter.dateTime.toLocalTime()}</td>
            <td>${barter.desireDescription}</td>
            <td>${barter.barterPropose}</td>
        </tr>
    </c:forEach>
</table>
</section>
</body>
</html>
