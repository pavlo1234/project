<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
	<h1>Welcome</h1>
	<a href="/">Go to home</a>
	<form method="post" action="/logout">
         <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
         <button>Log out</button>
     </form>
</body>
</html>