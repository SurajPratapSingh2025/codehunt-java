<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Web Server1</h1>

	<%-- <c:forEach var="myerror" items="${errorMessage.allErrors}">
		<li>${myerror.defaultMessage}</li>
	</c:forEach> --%>
	<h1></h1>
	<h1 th:text="${msg}">Default Message</h1>
	

	<!-- <form action="insert" method="post">
		<input type="text" name="id" placeholder="enter id"><br>
		<input type="text" name="name" placeholder="enter name"><br>
		<input type="text" name="address" placeholder="enter address"><br>
		<input type="text" name="salary" placeholder="enter salary"><br>
		<input type="time" name="time" placeholder="enter time"><br>
		<button>save</button>
	</form> -->
</body>
</html>






