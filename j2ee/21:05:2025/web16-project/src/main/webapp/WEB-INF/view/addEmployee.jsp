
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
  <a href="index.html">HOME</a>

  <%@include file="message.jsp" %>

   <form action="addEmployee"  method="post">
       <input type="text" name="name" placeholder="enter name"><br>
       <input type="text" name="address" placeholder="enter address"><br>
       <input type="text" name="age" placeholder="enter age"><br>
       <input type="text" name="salary" placeholder="enter salary"><br>
       <button>add</button>
   </form>
</body>
</html>
