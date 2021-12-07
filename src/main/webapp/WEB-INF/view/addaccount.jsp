<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">

<title>Add Account</title>
</head>
<body>
	<div class="container">
		<h1 class="d-flex justify-content-center">Add an account in bank</h1>
		<hr>
		<br> <a class="btn btn-primary"
			href="<%=request.getContextPath()%>/">Home</a> <br>    <br>

		<form:form action="save" modelAttribute="account" method="POST">

				<form:input type="hidden" path="accnumber" class="form-control" id="accnumber"/>
			
			<div class="form-group">
				<form:label path="name">Name</form:label> 
				<form:input path="name" class="form-control" id="name"/>
			</div>
			<div class="form-group">
				<form:label path="email">Email</form:label> 
				<form:input path="email" class="form-control" id="email"/>
			</div>
			<div class="form-group">
				<form:label path="phone">Phone</form:label> 
				<form:input path="phone" class="form-control" id="phone"/>
			</div>
			<div class="form-group">
				<form:label path="balance">Balance</form:label> 
				<form:input path="balance" class="form-control" id="balance"/>
			</div>
			
			<button type="submit" class="btn btn-success">Submit</button>
		</form:form>


		<!-- Optional JavaScript; choose one of the two! -->

		<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
		<script
			src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
			integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
			crossorigin="anonymous"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
			crossorigin="anonymous"></script>
	</div>
</body>
</html>