<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cafe Grabka - User Registration</title>
<link rel="stylesheet" href="/styles.css"/>
</head>
<body>

	<div class = "navbar">
		<a href="/"><button class ="navbut" type="button">Home</button></a>
		<a href="/user-reg"><button class ="navbut" type="button">User Registration</button></a>
		<a href="/about"><button class ="navbut" type="button">About Us</button></a>
		<a href="/contact"><button class ="navbut" type="button">Contact Us</button></a>
		<a href="/admin"><button class ="navbut" type="button">Admin</button></a>
	</div>

	<div class = "form">
		<h2>User Registration Form</h2>
		<form action="/user-confirm" method="post">
			<p><label>First Name</label><br>
				<input name="firstName" type="text" required/></p>
			<p><label>Last Name</label><br>
				<input name="lastName" type="text" required/></p>
			<p><label>Phone Number</label><br>
				<input name="phoneNum" type="tel"/></p>
			<p><label>E-Mail</label><br>
				<input name="userEmail" type="email"/></p>
			<p><label>Date of Birth</label><br>
				<input name="userYear" type="date" min="1900-01-01" max="2019-01-01"/></p>
			<p>
				<input type="radio" name="gender" value="male" checked> Male<br>
	 			<input type="radio" name="gender" value="female"> Female<br>
	  			<input type="radio" name="gender" value="other"> Other
	  		</p>
	  		<button type="submit">Complete Registration</button>
		</form>
	</div>
</body>
</html>