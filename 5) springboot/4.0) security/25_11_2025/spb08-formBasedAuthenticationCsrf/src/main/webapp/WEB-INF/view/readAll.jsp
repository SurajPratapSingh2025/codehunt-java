<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
</head>
<body>

<h2 style="color:blue;">${msgRead}</h2>

<table border="1" align="center" cellpadding="5">
    <tr><th>ID</th><th>Full Name</th><th>Course</th><th>Fee</th><th>College</th><th>Address</th></tr>
    <c:forEach var="s" items="${students}">
        <tr>
            <td>${s.rollno}</td><td>${s.fullname}</td><td>${s.course}</td><td>${s.fee}</td><td>${s.college}</td><td>${s.address}</td>
        </tr>
    </c:forEach>
</table>

<br>
<a href="home">Back to Home</a>

</body>
</html>