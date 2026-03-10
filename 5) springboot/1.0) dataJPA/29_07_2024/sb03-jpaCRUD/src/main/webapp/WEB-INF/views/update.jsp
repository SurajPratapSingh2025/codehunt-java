<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.application.pojo.Employee" %>

<%
    Employee emp = (Employee) request.getAttribute("employee");
    if(emp == null) {
        emp = new Employee();
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Update Employee</title>
</head>
<body>
    <h2>Update Employee</h2>
    <form action="/employee/update" method="post">
        ID: <input type="text" name="id" value="<%= emp.getId() %>" readonly/><br/>
        Name: <input type="text" name="name" value="<%= emp.getName() != null ? emp.getName() : "" %>" required/><br/>
        Address: <input type="text" name="addrsss" value="<%= emp.getAddrsss() != null ? emp.getAddrsss() : "" %>" /><br/>
        Salary: <input type="number" name="salary" value="<%= emp.getSalary() != 0 ? emp.getSalary() : "" %>" required/><br/>
        <input type="submit" value="Update" />
    </form>
    <br/>
    <a href="list">Back to List</a>
</body>
</html>





