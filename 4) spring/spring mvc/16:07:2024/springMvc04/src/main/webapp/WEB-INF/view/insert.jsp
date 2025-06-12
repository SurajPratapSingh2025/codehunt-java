<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${msg }
	
	<form action="insert" method="post">
		<input type="text" name="id" placeholder="enter id"><br>
		<input type="text" name="name" placeholder="enter name"><br>
		<input type="text" name="address" placeholder="enter address"><br>
		<input type="text" name="salary" placeholder="enter salary"><br>
		<button>INSERT</button>
	</form>
</body>
</html>