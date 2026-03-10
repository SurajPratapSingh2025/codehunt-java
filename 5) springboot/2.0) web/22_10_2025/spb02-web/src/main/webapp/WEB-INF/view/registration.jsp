<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registration</title>
</head>
<body>
	<h1 align="center">This is my Registration Page</h1>
	<form action="registration" method="post">
		<input type="number" name="rollno" placeholder="enter rollno"><br>
		<input type="text" name="fullname" placeholder="enter fullname"><br>
		<input type="text" name="course" placeholder="enter course"><br>
		<input type="number" name="fee" placeholder="enter fee"><br>
		<input type="text" name="college" placeholder="enter college"><br>
		<input type="text" name="address" placeholder="enter address"><br>
		<button>Register</button>
	</form>
	<br><br><br>
	<a href="home">Go to Home</a>
</body>
</html>