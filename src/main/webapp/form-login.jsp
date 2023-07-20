<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String user = (String) request.getSession().getAttribute("user");
	if(user != null) {
		request.getSession().setAttribute("user", user);
		response.sendRedirect("index.jsp");
	}
%>    
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>
	<h1>Login</h1>
	<form action="login" method="post">
		<div>
			<label>Usuário:</label>
			<input type="text" name="user"/>
		</div>
		<div>
			<label>Senha:</label>
			<input type="password" name="pass"/>
		</div>
		<button type="submit">Submit</button>
	</form>
</body>
</html>