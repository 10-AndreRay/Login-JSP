<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getSession().getAttribute("user") == null) {
		response.sendRedirect("form-login.jsp");
	}
	String user = (String) request.getSession().getAttribute("user");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello, <%=user %>! Welcome to my website!</h1>
	<a href="logoff">exit</a>
</body>
</html>