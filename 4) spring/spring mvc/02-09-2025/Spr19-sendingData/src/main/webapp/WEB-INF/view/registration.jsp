<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
	${msg}
	<h1 align="center">Student Registration Page</h1>
	
	<%-- <form action="${pageContext.request.contextPath}/dynamic/registration" method="post"> --%>
	<form action="registration" method="post">
		<input type="number" name="rollno" placeholder="enter rollno"/><br><br>
		<input type="text" name="fullname" placeholder="enter fullname"/><br><br>
		<input type="text" name="course" placeholder="enter course"/><br><br>
		<input type="number" name="fee" placeholder="enter fee"/><br><br>
		<input type="text" name="college" placeholder="enter college"/><br><br>
		<input type="text" name="address" placeholder="enter address"/><br><br><br>
		<button>Submit</button>
	</form>
	
	<br>
	<a href="../">Go to Welcome Page</a>
</body>
</html>