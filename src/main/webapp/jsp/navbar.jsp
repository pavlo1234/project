<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
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
				href="/profile">Home</a></li>
			<li class="nav-item"><a class="nav-item nav-link"
				href="/abiturients">Abiturients</a></li>
			<li class="nav-item"><a class="nav-item nav-link"
				href="/faculties">Faculties</a></li>
		</ul>
	</div>
	<form method="post" class="my-2 my-lg-0 form-inline" action="/logout">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		<button type="submit" class="btn btn-primary">
			<security:authorize access="!isAuthenticated()">Log in</security:authorize>
			<security:authorize access="isAuthenticated()">Log out</security:authorize>
		</button>
	</form>
</nav>