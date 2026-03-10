<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>read</title>
</head>
<body>
	${msgReadById}
	<h1 align="center">This is my Show Data Page</h1>
	<form action="readById" method="post">
		<input type="number" name="rollno" placeholder="enter rollno"><br>
		<button>Check</button>
	</form>
	<br><br><br>
	<a href="home">Go to Home</a>
</body>
</html>