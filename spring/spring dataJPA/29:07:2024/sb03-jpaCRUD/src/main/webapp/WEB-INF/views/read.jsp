<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.application.pojo.Employee" %>

<%
    Employee emp = (Employee) request.getAttribute("employee");
    if(emp == null) {
%>
    <p>Employee not found!</p>
<%
    } else {
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>View Employee</title>
</head>
<body>
    <h2>Employee Details</h2>
    <p><b>ID:</b> <%= emp.getId() %></p>
    <p><b>Name:</b> <%= emp.getName() %></p>
    <p><b>Address:</b> <%= emp.getAddrsss() %></p>
    <p><b>Salary:</b> <%= emp.getSalary() %></p>
    <br/>
    <a href="../list">Back to List</a>
</body>
</html>

<%
    }
%>
