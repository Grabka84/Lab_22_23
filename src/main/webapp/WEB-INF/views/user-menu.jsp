<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cafe Grabka - User Menu</title>
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
	
	<h2>User Menu</h2>
	<div class = "body">
		<p>In the <b>Users</b> menu, you can login, register as a new user, edit your own user information, and admins can edit all users</p>
		<br><a href="/user-reg"><button class ="menu">Register a new user</button></a>
		<br><a href="/user-edit"><button class ="menu">Edit current user</button></a>
		<br><a href="/user-admin"><button class ="menu">Edit all users</button></a>
	</div>
	
</div>
</body>
</html>