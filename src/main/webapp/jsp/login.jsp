<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log in</title>
</head>
<body>
	<form action="/login" method="post">
		<input name="email" placeholder="Your email" type="text" required/><br />
		<input name="password" placeholder="Your password" type="password" required/>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<button>Log in</button>
	</form>
	<span>Have not account ? <a href="/register">register here</a></span>
</body>
</html>