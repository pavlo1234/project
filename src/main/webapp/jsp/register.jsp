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
			<label for="exampleInputEmail1">Username</label> <input type="text"
				class="form-control" id="exampleInputEmail1" name="username"
				required>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> <input
				type="email" class="form-control" id="exampleInputEmail1"
				name="email" required>
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input
				type="password" class="form-control" id="exampleInputPassword1"
				name="password" required>
		</div>

		<div class="custom-file">
			<input type="file" class="custom-file-input" name="file" id="customFile">
			<label class="custom-file-label" for="customFile">Choose user
				image</label>
		</div>

		<div class="form-group mt-3">
			<button type="submit" class="btn btn-primary">Submit</button>
			<a href="/" class="link">Go to home</a>
		</div>

	</form:form>
	<br />



</body>
</html>