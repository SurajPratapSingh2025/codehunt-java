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
    <h1>Welcome to Home</h1>
    <c:set var="name" value="${param.name}"/>
    <c:set var="city" value="${param.city}"/>
    
    <sql:setDataSource
        var="con"
        driver="com.mysql.cj.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/jstl"
        user="root"
        password="rootsystem"
    />
    
    <sql:update dataSource="${con}" var="row">
        insert into employee(name,city) values(?,?)
        <sql:param value="${param.name}"/>
        <sql:param value="${param.city}"/>
    </sql:update>
    
    <c:if test="${row == 1}">
        <h1>Data Inserted</h1>
    </c:if>
</body>
</html>