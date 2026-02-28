<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
	<h1 align="center">Student Registration Page</h1>
	
	<form action="registration.do" method="post">
		<input type="number" name="rollno" placeholder="enter rollno"/><br><br>
		<input type="text" name="fullname" placeholder="enter fullname"/><br><br>
		<input type="text" name="course" placeholder="enter course"/><br><br>
		<input type="number" name="fee" placeholder="enter fee"/><br><br>
		<input type="text" name="college" placeholder="enter college"/><br><br>
		<input type="text" name="address" placeholder="enter address"/><br><br><br>
		<button>Submit</button>
	</form>
	
	<br>
	<a href="index.html">Go to Welcome Page</a>
</body>
</html>