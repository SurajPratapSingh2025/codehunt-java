<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Read Dynamically Data Successfully</h1>
	<%
		List<String> list=(List<String>) session.getAttribute("data");
		for(String data:list){
	%>
		<h2>Name: <%=data %></h2>
	<%		
		}
	%>
</body>
</html>