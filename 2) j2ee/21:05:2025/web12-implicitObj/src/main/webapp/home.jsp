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
		pageContext.setAttribute("msg", "this is my page level message",PageContext.PAGE_SCOPE);
		pageContext.setAttribute("msg", "this is my session level message",PageContext.SESSION_SCOPE);
		pageContext.setAttribute("msg", "this is my request level message",PageContext.REQUEST_SCOPE);
		pageContext.setAttribute("msg", "this is my Application level message",PageContext.APPLICATION_SCOPE);
		
	
		request.setAttribute("msg", "this is my request level message");
		session.setAttribute("msg", "this is my session level message");
		application.setAttribute("msg", "this is my application level message");
	
		request.getDispatcherType();		//request level=> get kr sakte hai
		response.sendRedirect("xyz.jsp");	//request level=> get nhi kr sakte hai	//generate new request
		
		//jaha jaha bhi request ja rhi hogi, wha wha request level access kr skte hai
		//jaha jaha session active rhega i.e. jsessionID milegi, wha wha session level access kr skte hai
		//jb browser change krta hai tb user bhi change hota hai
		
	%>
	<%
		pageContext.include("xyz.jsp");	/* also used for include */
		pageContext.forward("xyz.jsp");
		
		
	%>
	
	
</body>
</html>