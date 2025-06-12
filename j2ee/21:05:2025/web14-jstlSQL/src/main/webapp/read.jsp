<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    
    <sql:setDataSource
        var="con"
        driver="com.mysql.cj.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/jstl"
        user="root"
        password="rootsystem"
    />
     
    <sql:query dataSource="${con}" var="rs">
    	select * from employee;
    </sql:query>
    
    <c:forEach var="data" items="${rs.rows}">
    	${data.name}<br>
    	${data.city}<br>
    	 <h3>======================================</h3>
    </c:forEach>
   
    
</body>
</html>