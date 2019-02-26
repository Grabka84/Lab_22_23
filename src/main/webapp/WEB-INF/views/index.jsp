<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cafe Grabka - Index</title>
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
	
	<header>
		<h3>Welcome to the Grabka Coffee Shop</h3> 
		<h4>"Let's Get Roasted!"</h4>
	</header>
	
	<div class = "body">Welcome to the Grabka Coffee Shop website, please choose one of the links in the navbar to continue. 
		<ul>
			<li>In the <b>Users</b> menu, you can login, register as a new user, edit your own user information, and admins can edit all users</li>
			<li>In the <b>Inventory</b> menu, you can buy items from our current inventory on hand, and admins can enter the inventory management system</li>
			<li>Read the <b>About Us</b> page to get a little bit of information about the company</li>
			<li>Visit the <b>Contact Us</b> page if you need to want to send us a good word and let us know how great we are!</li>
		</ul>
	</div>
	
	<div>
		<img src="/images/coffeestock.jpg" alt="Coffee cup surrounded by beans" class = "stock">
	</div>
	
</div>
</body>
</html>