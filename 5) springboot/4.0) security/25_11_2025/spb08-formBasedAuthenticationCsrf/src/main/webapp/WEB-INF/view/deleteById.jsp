<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
</head>
<body>
	${msgDeleteById}
	<h1 align="center">This is my Data Delete Page</h1>
	<form action="deleteById" method="post">
		<input type="number" name="rollno" placeholder="enter rollno"><br>
		<button>Delete</button>
	</form>
	<br><br><br>
	<a href="home">Go to Home</a>
</body>
</html>