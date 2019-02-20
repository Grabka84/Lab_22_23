<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cafe Grabka - User Confirmation</title>
<link rel="stylesheet" href="/styles.css"/>
</head>
<body>

	<div class = "navbar">
		<a href="/"><button type="button">Home</button></a>
		<a href="/user-reg"><button type="button">User Registration</button></a>
		<a href="/about"><button type="button">About Us</button></a>
		<a href="/contact"><button type="button">Contact Us</button></a>
	</div>
	
	Welcome ${ users.firstName } ${ users.lastName }, you have successfully registered!
	
</body>
</html>