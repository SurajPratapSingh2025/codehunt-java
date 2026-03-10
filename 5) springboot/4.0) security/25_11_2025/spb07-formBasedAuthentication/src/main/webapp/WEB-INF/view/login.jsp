<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>custom login</title>
</head>
<body>
	<%  
		if(request.getParameter("error")!=null){
	%>
		<p style="color:red;">Invalid Username or Password</p>
	<%
		}
	%>
	<h1 align="center">This is my Custom Login Page</h1>
	<form action="/dologin" method="post">
		<input type="text" name="user" placeholder="enter username"><br>
		<input type="text" name="pass" placeholder="enter password"><br>
		
		<button>Login</button>
	</form>
	<br><br><br>
	<a href="home">Go to Home</a>
</body>
</html>