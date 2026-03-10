<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${deleteData}
	<c:forEach var="employee" items="${readData}">
		<li>${employee.id}</li>
		<li>${employee.name}</li>
		<li>${employee.address}</li>
		<li>${employee.salary}</li>
		<li>${employee.date}</li>
		<li>${employee.ucode}</li>
		
		<a href="delete?id=${employee.id}">DELETE</a>
		
		<br><br>
	</c:forEach>
</body>
</html>

