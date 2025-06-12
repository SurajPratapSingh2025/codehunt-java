<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Read Page</h1>
	
	${msg }
	<c:forEach var="cricketer" items="${data}">
		ID: ${cricketer.id}<br>
		NAME: ${cricketer.name}<br>
		ADDRESS: ${cricketer.address}<br>
		SALARY: ${cricketer.id}<br>
		<a href="deletefromread?id=${cricketer.id}&name=${cricketer.name}">DELETE</a><br><br>
		
	</c:forEach>
	
</body>
</html>