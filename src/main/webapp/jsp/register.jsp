<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
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
<title>Create Account</title>
</head>
<body>

	<form:form method="post" modelAttribute="user" enctype="multipart/form-data" 
		style="max-width: 500px; margin: 150px auto 0 auto;">

		<div class="form-group">
			<label for="exampleInputEmail1"><spring:message code="register.username"/></label> <input type="text"
				class="form-control" id="exampleInputEmail1" name="username"
				required>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1"><spring:message code="register.email"/></label> <input
				type="email" class="form-control" id="exampleInputEmail1"
				name="email" required>
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1"><spring:message code="register.password"/></label> <input
				type="password" class="form-control" id="exampleInputPassword1"
				name="password" required>
		</div>

		<div class="custom-file">
			<input type="file" class="custom-file-input" name="file" id="customFile">
			<label class="custom-file-label" for="customFile"><spring:message code="register.chooseImage"/></label>
		</div>
		
		<ul class="navbar-nav" style="flex-direction: row;">
			<li class="nav-item"><a class="nav-item nav-link" href="${requestScope['javax.servlet.forward.request_uri']}?lang=ua">UA</a></li>
			<li class="nav-item nav-link">/</li>
			<li class="nav-item"><a class="nav-item nav-link" href="${requestScope['javax.servlet.forward.request_uri']}?lang=en">EN</a></li>
		</ul>

		<div class="form-group mt-3">
			<button type="submit" class="btn btn-primary"><spring:message code="register.submit"/></button>
			<a href="/" class="link"><spring:message code="register.goToHome"/></a>
		</div>

	</form:form>
	<br />



</body>
</html>