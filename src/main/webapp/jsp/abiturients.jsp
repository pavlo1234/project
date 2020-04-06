<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="bootstrap.jsp"></jsp:include>
<title>Abiturients list</title>
</head>
<body>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Username</th>
				<th scope="col">Email</th>
				<th scope="col">Faculty name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${abiturients}" var="abiturient">
				<tr>
					<th scope="row">${abiturient.getId()}</th>
					<td>${abiturient.getUsername()}</td>
					<td>${abiturient.getFacultyName()}</td>
					<td>${abiturient.getSumMarks()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>