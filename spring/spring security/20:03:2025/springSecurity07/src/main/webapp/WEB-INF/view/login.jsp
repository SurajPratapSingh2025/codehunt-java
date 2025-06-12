<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String s=(String)request.getParameter("error");
		if(s!=null){
	%>
		<p style="color: red" align="center">INCORRECT USERNAME OR PASSWORD</p>
	<%} %>
	<form method="post" action="/doLogin">
		<input type="text" name="username" placeholder="enter username"><br>
		<input type="text" name="password" placeholder="enter password"><br>
		<button>login</button>
	</form>
</body>
</html>