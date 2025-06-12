<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Home 2</h1>
	<%-- 
	${param.name}
	${param.city}
	 --%>
	
	<c:set var="name" value="${param.name}"></c:set>
	<c:set var="city" value="${param.city}"></c:set>
	
	<c:choose>
		<c:when test="${name==city}">
			<h1>Name & Adress can't be equal</h1>
		</c:when>
		
		<c:when test="${fn:startsWith(city,'a')}">
			<h1>Invalid City</h1>
		</c:when>
		
		<c:otherwise>
			<h1>SUCCESS</h1>
			<h3>Name= ${name} : ${fn:length(name)}</h3>
			<h3>City= ${city} : ${fn:length(city)}</h3>
		</c:otherwise>
	</c:choose>
	
</body>
</html>