<%@ page 
	
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    session="false"
    isELIgnored="true"
    errorPage="error.jsp"
    buffer="8kb"
    
%>
<!-- 
JSP Page Directive Attributes::
	1) language				2) extends				3) import*				4) session
	5) buffer				6) autoFlush			7) isThreadSafe			8) info
	9) errorPage*			10) isErrorPage*			11) contentType			12) pageEncoding
	13) isELIgnored*		14) deferredSyntaxAllowedAsLiteral
 -->
<!-- contentType="
		text/html; 			=> MIME Type
		text/plain;
		text/javascript; 
		charset=UTF-8" -->
<!-- isELIgnored="true" => study in JSTL -->
<!-- isELIgnored bydefault value is true -->
<!-- session bydefault true -->
<!-- session false krne se, session tracking nhi kr skte i.e. session object get nhi hoga -->
<!-- buffer bydefault value -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="fragements/header.jsp" %>
	<h2>BODY</h2>
	<%
		/* session.getAttribute("") */
		
		/* for(int i=1; i<=100; i++){
			out.print(i);
			if(i==90){
				String k=null;
				k.length();
			}
		} */
		
		
		
	%>
	
	<%@ include file="fragements/footer.jsp" %>
</body>
</html>