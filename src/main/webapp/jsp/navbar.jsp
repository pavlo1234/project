<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="lang" scope="request" value="ua" />


<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	<a class="navbar-brand" href="#">Navbar</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNavDropdown">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-item nav-link active"
				href="/profile"><spring:message code="navbar.home" /></a></li>
			<li class="nav-item"><a class="nav-item nav-link"
				href="/abiturients"><spring:message code="navbar.abiturients" /></a></li>
			<li class="nav-item"><a class="nav-item nav-link"
				href="/faculties"><spring:message code="navbar.faculties" /></a></li>
		</ul>
	</div>

	<form method="post" class="my-2 my-lg-0 form-inline" action="/logout">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		<button type="submit" class="btn btn-primary">
			<security:authorize access="!isAuthenticated()">
				<spring:message code="navbar.login" />
			</security:authorize>
			<security:authorize access="isAuthenticated()">
				<spring:message code="navbar.logout" />
			</security:authorize>
		</button>
		<ul class="navbar-nav" style="flex-direction: row;">
			<li class="nav-item"><a class="nav-item nav-link link_lang"
				onclick="load('ua')">UA</a></li>
			<li class="nav-item nav-link">/</li>
			<li class="nav-item"><a class="nav-item nav-link"
				onclick="load('en')">EN</a></li>
		</ul>
	</form>
</nav>

<script>
	function load(lang) {
		let href = window.location.href;

		if (href.indexOf('?') == -1)
			href += "?lang=" + lang;
		else if (href.indexOf("?lang=ua") != -1)
			href = href.replace("?lang=ua", "?lang=" + lang);
		else if (href.indexOf("?lang=en") != -1)
			href = href.replace("?lang=en", "?lang=" + lang);

		if (href.indexOf("&lang=ua") != -1)
			href = href.replace("&lang=ua", "&lang=" + lang);
		else if (href.indexOf("&lang=en") != -1)
			href = href.replace("&lang=en", "&lang=" + lang);
		else
			href += "&lang=" + lang;

		window.location.href = href;

	}
</script>

