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
<title>Faculties</title>
</head>
<body>

	<jsp:include page="navbar.jsp"></jsp:include>

	<div class="mx-5 mt-5">
		<h2>All faculties of our university :</h2>
		<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Name</th>
				<th scope="col">Max number of students</th>
				<th scope="col">Register</th>
				<th scope="col">Rating</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${faculties}" var="faculty">
				<tr>
					<th scope="row">${faculty.getId()}</th>
					<td>${faculty.getName()}</td>
					<td>${faculty.getMaxStudentCount()}</td>
					<td><a href="/faculty_register?id=${faculty.getId()}">Register</a></td>
					<td><a href="/rating?faculty_id=${faculty.getId()}">Rating</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	</div>

	

</body>
</html>