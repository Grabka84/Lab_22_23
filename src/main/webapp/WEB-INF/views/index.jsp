<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cafe Grabka - Index</title>
<link rel="stylesheet" href="/styles.css"/>

</head>
<body>

	<div class = "navbar">
		<a href="/"><button type="button">Home</button></a>
		<a href="/user-reg"><button type="button">User Registration</button></a>
		<a href="/about"><button type="button">About Us</button></a>
		<a href="/contact"><button type="button">Contact Us</button></a>
	</div>
	
	<header>
		<h3>Welcome to Grabka's Coffee Shop</h3> 
		<h4>"Let's Get Roasted!"</h4>
	</header>
	
	<div class = "body">
		<h2>Items List</h2>
		<table class = "list">
		<thead>
			<tr>
				<th>Name</th><th>Description</th><th>Price</th><th>QOH</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${items}">
				<tr>
					<td>${item.name}</td>
					<td>${item.description}</td>
					<td>${item.price}</td>
					<td>${item.quantity}</td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
	</div>
</body>
</html>