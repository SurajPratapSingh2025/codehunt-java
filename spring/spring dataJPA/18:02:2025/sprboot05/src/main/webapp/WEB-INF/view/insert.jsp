<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="message" items="${errorList}">
		<li>${message}</li>
	</c:forEach>
	
	<form action="" method="post" enctype="multipart/form-data">
		<input type="text" name="id" placeholder="enter id"><br>
		<input type="text" name="name" placeholder="enter name"><br>
		<input type="text" name="address" placeholder="enter address"><br>
		<input type="text" name="salary" placeholder="enter salary"><br>
		<input type="date" name="date" ><br>
		<input type="file" name="myfile"><br>
		
		<button>SUBMIT</button>
	</form>
	
</body>
</html>
