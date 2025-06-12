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
    <title>Insert Employee</title>
</head>
<body>
    <h2>Insert New Employee</h2>
    <form action="insert" method="post">
        <table border="1" cellpadding="5" cellspacing="0">
            <tr>
                <td>ID:</td>
                <td><input type="text" name="id" value="<%= emp.getId() != 0 ? emp.getId() : "" %>" required /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" value="<%= emp.getName() != null ? emp.getName() : "" %>" required /></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="addrsss" value="<%= emp.getAddrsss() != null ? emp.getAddrsss() : "" %>" /></td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td><input type="number" name="salary" value="<%= emp.getSalary() != 0 ? emp.getSalary() : "" %>" required /></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Submit" />
                </td>
            </tr>
        </table>
    </form>
    <br/>
    <a href="list">Back to List</a>
</body>
</html>
