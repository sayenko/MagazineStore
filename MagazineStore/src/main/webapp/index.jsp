<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="registration" method="post">
	
		<label for="firstName">First Name :</label> <input name="firstName" style="margin-bottom: 15px"><br>
		
		<label for="lastName">Last Name :</label> <input name="lastName" style="margin-bottom: 15px;margin-left: 2px"><br>
		
		<label for="email">Email :</label> <input name="email" style="margin-bottom: 15px;margin-left: 33px"><br>
		
		<label for="password">Password :</label> <input name="password" style="margin-bottom: 15px;margin-left: 10px"><br>
		
		<input type="submit" value="Submit">
	
		<a href="login.jsp" style="margin-left: 165px">login</a>
		
	</form>
	
</body>
</html>