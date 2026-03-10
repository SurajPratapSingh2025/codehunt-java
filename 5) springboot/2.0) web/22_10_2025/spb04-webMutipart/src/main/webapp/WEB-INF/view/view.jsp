<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<body>
	<h1 align="center">This is my Show Data Page</h1>

	<table style="width: 100%; table-layout: fixed" border="1"
		align="center" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Description</th>
			<th>Photo</th>
			<th>Update</th>
			<th>Delete</th>
			<c:forEach var="s" items="${list}">
				<tr>
					<td align="center">${s.id}</td>
					<td>${s.title}</td>
					<td>${s.description}</td>
					<td align="center"><img style="width: 50%; height: auto" alt=""
						src="${pageContext.request.contextPath}/images/${s.filename}"></td>
					<td align="center"><a href="#">Click</a></td>
					<td align="center"><a href="#">Click</a></td>
				</tr>
			</c:forEach>
	</table>


	<a href="home">Go to Home</a>
</body>
</html>