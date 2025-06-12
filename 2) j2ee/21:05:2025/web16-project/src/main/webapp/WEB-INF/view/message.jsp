<%
   String msg=(String)request.getAttribute("msg");
   if(msg!=null){
%>
<%=msg%>
<%  
  request.removeAttribute("msg");
} %>
	
	
	