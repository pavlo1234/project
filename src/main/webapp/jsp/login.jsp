<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="bootstrap.jsp"></jsp:include>
<title>Log in</title>
</head>
<body>

	<form action="/login" method="post" style="max-width: 500px; margin: 100px auto 0 auto;">
		<div class="form-group">
			<label for="exampleInputEmail1"><spring:message code="login.email"/></label> 
			<input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email" required> 
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1"><spring:message code="login.password"/></label> 
			<input type="password" class="form-control" id="exampleInputPassword1" name="password" required>
		</div>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<button type="submit" class="btn btn-primary"><spring:message code="login.submit"/></button>
		<ul class="navbar-nav" style="flex-direction: row;">
			<li class="nav-item"><a class="nav-item nav-link" href="${requestScope['javax.servlet.forward.request_uri']}?lang=ua">UA</a></li>
			<li class="nav-item nav-link">/</li>
			<li class="nav-item"><a class="nav-item nav-link" href="${requestScope['javax.servlet.forward.request_uri']}?lang=en">EN</a></li>
		</ul>
		<span><a href="/register" class="link"><spring:message code="login.registerHere"/></a></span>
	</form>
	
	
</body>
</html>