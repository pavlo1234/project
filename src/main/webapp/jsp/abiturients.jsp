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
<title>Abiturients list</title>
</head>
<body>

	<jsp:include page="navbar.jsp"></jsp:include>

	<div class="mx-5 mt-5">
		<h1><spring:message code="abiturients.heading"/> : </h1>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col"><spring:message code="abiturients.username"/></th>
					<th scope="col"><spring:message code="abiturients.facultyName"/></th>
					<th scope="col"><spring:message code="abiturients.sumMarks"/></th>
					<security:authorize access="hasRole('ROLE_ADMINISTRATOR')">
						<th scope="col"><spring:message code="abiturients.adminButton"/></th>
					</security:authorize>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${abiturients}" var="abiturient">
					<tr>
						<th scope="row">${abiturient.getId()}</th>
						<td>${abiturient.getUsername()}</td>
						<td>${abiturient.getFacultyName()}</td>
						<td>${abiturient.getSumMarks()}</td>
						<security:authorize access="hasRole('ROLE_ADMINISTRATOR')">
							<td scope="col"><a href="/addToRating?abiturientId=${abiturient.getId()}"><spring:message code="abiturients.adminConfirmButton"/></a></td>
						</security:authorize>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>