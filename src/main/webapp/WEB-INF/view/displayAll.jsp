<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

    <title>Display All</title>
  </head>
  <body>
    <div class="container">
    <h1 class="d-flex justify-content-center">List of all accounts in bank</h1>
    <hr><br>
    <a class="btn btn-primary" href="<%=request.getContextPath()%>/">Home</a>    <br>
    <br>
    <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Account Number</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Phone</th>
      <th scope="col">Balance</th>
    </tr>
  </thead>
  <tbody>
  <!-- loop over and print our customers -->
	<c:forEach var="tempAccount" items="${listaccount}">
    <tr>
      <td>${tempAccount.accnumber}</td>
      <td>${tempAccount.name}</td>
      <td>${tempAccount.email}</td>
      <td>${tempAccount.phone}</td>
      <td>${tempAccount.balance}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
    
    

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
  </div>
  </body>
</html>