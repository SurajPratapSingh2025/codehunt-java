<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registration</title>
</head>
<body>
	<h1 align="center">This is my Registration Page</h1>
	<form action="registration" method="post">
		<%-- <c:forEach var="e" items="${errors}">
			<c:if test="${e.field=='rollno'}">${e.defaultMessage}</c:if>
		</c:forEach> --%>
		<input type="number" name="rollno" placeholder="enter rollno"><br>
		
		<c:forEach var="e" items="${errors}">
			<c:if test="${e.field=='fullname'}">${e.defaultMessage}</c:if>
		</c:forEach><br>
		<input type="text" name="fullname" placeholder="enter fullname"><br>
		
		<c:forEach var="e" items="${errors}">
			<c:if test="${e.field=='course'}">${e.defaultMessage}</c:if>
		</c:forEach><br>
		<input type="text" name="course" placeholder="enter course"><br>
		
		<%-- <c:forEach var="e" items="${errors}">
			<c:if test="${e.field=='fee'}">${e.defaultMessage}</c:if>
		</c:forEach> --%><br>
		<input type="number" name="fee" placeholder="enter fee"><br>
		
		<c:forEach var="e" items="${errors}">
			<c:if test="${e.field=='college'}">${e.defaultMessage}</c:if>
		</c:forEach><br>
		<input type="text" name="college" placeholder="enter college"><br>
		
		<c:forEach var="e" items="${errors}">
			<c:if test="${e.field=='address'}">${e.defaultMessage}</c:if>
		</c:forEach><br>
		<input type="text" name="address" placeholder="enter address"><br>
		
		<button>Register</button>
	</form>
	<br><br><br>
	<a href="home">Go to Home</a>
</body>
</html>