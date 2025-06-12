<%@page import="app.dto.EmployeeDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="index.html" >home</a>

  <%
      ArrayList<EmployeeDTO>  arrayList=(ArrayList<EmployeeDTO> )request.getAttribute("data");
      for( EmployeeDTO employeeDTO : arrayList){
  %><br><hr>
      NAME: <%=employeeDTO.getName() %> <br>
      ADDRESS:  <%=employeeDTO.getAddress() %><br>
      AGE:   <%=employeeDTO.getAge() %><br>
      SALARY:    <%=employeeDTO.getSalary() %><br>
      
  <%} %>

</body>
</html>