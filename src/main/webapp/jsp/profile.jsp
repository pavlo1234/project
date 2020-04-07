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
<title>Profile</title>
</head>
<body>

	<jsp:include page="navbar.jsp"></jsp:include>

	<div class="mx-5 mt-5">
		<h1>Welcome, ${user.getUsername()}</h1>
		<img src="${image}" class="rounded float-left">
	</div>

</body>
</html>