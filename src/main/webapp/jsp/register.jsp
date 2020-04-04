<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Account</title>
</head>
<body>
	<form:form method="post" modelAttribute="user">
	
		<input name="username" placeholder="Your name" type="text" required></input>
		<input name="email" placeholder="Your email" type="email" required></input>
		<input name="password" placeholder="Your password" type="password" required></input>
		
		<button type="submit">Submit</button>
		
	</form:form><br/>
	
	<a href="/">Go to home</a>

</body>
</html>