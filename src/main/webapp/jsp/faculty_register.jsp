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

<title>Register to faculty</title>

</head>
<body>

	<jsp:include page="navbar.jsp"></jsp:include>
	
	<div class="mx-5 mt-5">
		<h1>Please, put down your marks : </h1>
		<form action="/addAbiturient" method="get" style="width: 800px;">
		<input type="hidden" name="username"
			value="<security:authentication property="principal.username"/>">
		<input type="hidden" name="facultyId" value="${faculty.getId()}" />
		<c:forEach items="${faculty.getRequiredSubjects()}" var="subject">
			<div class="form-group">
				<label for="${subject.getId()}">${subject.getName()} : </label> <input
					type="number" class="form-control mark" max="12" min="1" required />
			</div>
		</c:forEach>
		<input type="hidden" name="passingScoreOfFaculty" value="${faculty.getPassingScore()}"/>
		<input type="hidden" class="sumMarks" name="sumMarks" />
		<button type="button" class="btn btn-primary">Sign in</button>
	</form>
	</div>

	


	<script>
		$(function() {
			$(".btn").click(function() {
				let sum = 0;
				$("input.mark").each(function() {
					sum += parseInt($(this).val(), 10);
				});
				$.get("/addAbiturient", {
					username : $("input[name='username']").val(),
					facultyId : $("input[name='facultyId']").val(),
					sumMarks : sum,
					passingScoreOfFaculty : $("input[name='passingScoreOfFaculty']").val()
				}, function() {
					alert("Success");
				});
			});
		});
	</script>


</body>
</html>