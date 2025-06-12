<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	JSP Implicit Objects (9 Objects)::
	================================
	1) request 		(HttpServletRequest)
	2) response 	(HttpServletResponse)
	3) out 			(JspWriter)
	4) session 		(HttpSession)
	5) application 	(ServletContext)
	6) pageContext 	(PageContext)
	7) page 		(Object - current servlet instance)
	8) config 		(ServletConfig)
	9) exception 	(Throwable - available in error pages only)
	 -->
	
	
	<%
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		
		/* out.print(name+" | "+address); */
		
		out.print(name+" : "+page.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
	%>
	
	
	
	
	
	
</body>
</html>