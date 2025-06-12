<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- output: everytime output added -->
	<%!private String name; %>
	<%
		String name=request.getParameter("name");
		this.name=this.name+name;
	%>
	<h3>Name: <%=name %></h3>	
</body>
</html>