<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.application.pojo.Employee" %>
<%@ page import="java.util.List" %>

<%
    List<Employee> employees = (List<Employee>) request.getAttribute("employees");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Employee List</title>
</head>
<body>
    <h2>Employee List</h2>
    <a href="insert">Add New Employee</a><br/><br/>
    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>ID</th><th>Name</th><th>Address</th><th>Salary</th><th>Actions</th>
        </tr>
        <%
            if(employees != null && !employees.isEmpty()) {
                for(Employee emp : employees) {
        %>
        <tr>
            <td><%= emp.getId() %></td>
            <td><%= emp.getName() %></td>
            <td><%= emp.getAddrsss() %></td>
            <td><%= emp.getSalary() %></td>
            <td>
                <a href="read/<%= emp.getId() %>">View</a> |
                <a href="update/<%= emp.getId() %>">Edit</a> |
                <a href="delete/<%= emp.getId() %>" onclick="return confirm('Are you sure you want to delete this employee?');">Delete</a>
            </td>
        </tr>
        <%
                }
            } else {
        %>
        <tr><td colspan="5">No employees found.</td></tr>
        <%
            }
        %>
    </table>
    <br/>
    <a href="../">Back to Home</a>
</body>
</html>
