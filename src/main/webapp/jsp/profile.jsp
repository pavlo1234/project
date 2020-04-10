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
<link href="${pageContext.request.contextPath}/jsp/css/profile.css"
	rel="stylesheet" />
<title>Profile</title>
</head>
<body>

	<jsp:include page="navbar.jsp"></jsp:include>

	<div class="container emp-profile">
		<div class="row">
			<div class="col-md-4">
				<div class="profile-img">
					<img src="${image}" alt="" />
				</div>
			</div>
			<div class="col-md-6">
				<div class="profile-head">
					<h5>${user.getUsername()}</h5>
					<h6>${user.getRole().toString().replace("ROLE_", "")}</h6>
					<ul class="nav nav-tabs" id="myTab" role="tablist">
						<li class="nav-item"><a class="nav-link active" id="home-tab"
							data-toggle="tab" href="#home" role="tab" aria-controls="home"
							aria-selected="true">About</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
			</div>
			<div class="col-md-8">
				<div class="tab-content profile-tab" id="myTabContent">
					<div class="tab-pane fade show active" id="home" role="tabpanel"
						aria-labelledby="home-tab">
						<div class="row">
							<div class="col-md-6">
								<label>Name</label>
							</div>
							<div class="col-md-6">
								<p>${user.getUsername()}</p>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6">
								<label>Email</label>
							</div>
							<div class="col-md-6">
								<p>${user.getEmail()}</p>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6">
								<label>Role</label>
							</div>
							<div class="col-md-6">
								<p>${user.getRole().toString().replace("ROLE_", "")}</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



</body>
</html>