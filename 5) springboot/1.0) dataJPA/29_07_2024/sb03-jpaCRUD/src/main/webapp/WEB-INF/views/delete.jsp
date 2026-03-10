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
    <title>Delete Employee</title>
</head>
<body>
    <h2>Delete Employee</h2>
    <p>Are you sure you want to delete employee <b><%= emp.getName() %></b> (ID: <%= emp.getId() %>)?</p>
    <form action="delete/<%= emp.getId() %>" method="get">
        <input type="submit" value="Delete" />
        <a href="../list">Cancel</a>
    </form>
</body>
</html>

<%
    }
%>
