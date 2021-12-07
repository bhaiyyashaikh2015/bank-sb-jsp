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

<title>Transfer</title>
</head>
<body>
	<div class="container">
		<h1 class="d-flex justify-content-center">Transfer money from one account to another</h1>
		<hr>
		<br> <a class="btn btn-primary"
			href="<%=request.getContextPath()%>/">Home</a> <br>    <br>

		<form:form action="transfer" modelAttribute="account" method="GET">

			<div class="form-group">
				<form:label path="senderAcc">Enter sender's account number</form:label> 
				<form:input path="senderAcc" class="form-control" id="senderAcc"/>
			</div>
			
			<div class="form-group">
				<form:label path="recieverAcc">Enter reciever's account number</form:label> 
				<form:input path="recieverAcc" class="form-control" id="recieverAcc"/>
			</div>
			
			<div class="form-group">
				<form:label path="amount">Enter amount to transfer</form:label> 
				<form:input path="amount" class="form-control" id="amount"/>
			</div>
			
			<button type="submit" class="btn btn-success">Transfer</button>
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