<!-- directiv tag -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP Page</h1>
	<!-- declarative tag: use for variable declare -->
	<%!
		int a; 
		int b; 
		int c;
	%>
	<!-- Scripting tag: use for processing in service, inside this method creation not allowed-->
	<%
		a=10;
		b=20;
		c=a+b;
		out.print(c);	//implicit object
		//request.getParameter("name");	//data come from servlet
	%>
	
	<%=c %>	<!-- expresson tag: use for print variable-->
</body>
</html>