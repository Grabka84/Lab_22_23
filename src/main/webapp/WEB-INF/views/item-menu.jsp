<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cafe Grabka - Items menu</title>
<link rel="stylesheet" href="/styles.css"/>
</head>
<body>
<div class = "container">
	<div class = "navbar">
		<a href="/"><button class ="navbut" type="button">Home</button></a>
		<a href="/user-menu"><button class ="navbut" type="button">Users</button></a>
		<a href="/item-menu"><button class ="navbut" type="button">Inventory</button></a>
		<a href="/about"><button class ="navbut" type="button">About Us</button></a>
		<a href="/contact"><button class ="navbut" type="button">Contact Us</button></a>
	</div>
	
	<div class = "body">
		<h2>Inventory List</h2>
		<p>In the <b>Inventory</b> menu, you can buy items from our current inventory on hand, and admins can enter the inventory management system</p>
		<table class = "list">
		<thead>
			<tr>
				<th>Name</th><th>Description</th><th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${items}">
				<tr>
					<td>${item.name}</td>
					<td>${item.description}</td>
					<td>${item.price}</td>
					<td><a href="/add-item-to-cart"><button class="additem">Buy</button></a>
				</tr>
			</c:forEach>
		</tbody>
		</table>
	</div>
	
	<div class = "body">
		<a href="/item-edit"><button class ="navbut">Inventory admin</button></a>
	</div>

</div>
</body>
</html>