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
		<a href="/"><button type="button">Home</button></a>
		<a href="/user-reg"><button type="button">User Registration</button></a>
		<a href="/about"><button type="button">About Us</button></a>
		<a href="/contact"><button type="button">Contact Us</button></a>
	</div>

	<div class = "form">
		<h2>User Registration Form</h2>
		<form action="/user-confirm" method="post">
			<p><label>First Name</label><br>
				<input name="firstName" type="text" required/></p>
			<p><label>Last Name</label><br>
				<input name="lastName" type="text" required/></p>
			<p><label>Phone Number</label><br>
				<input name="phoneNum" type="tel" required/></p>
			<p><label>E-Mail</label><br>
				<input name="userEmail" type="email" required/></p>
			<p><label>Date of Birth</label><br>
				<input name="userYear" type="date" min="1900-01-01" max="2019-01-01" required/></p>
			<p>
				<input type="radio" name="gender" value="male" checked required> Male<br>
	 			<input type="radio" name="gender" value="female"> Female<br>
	  			<input type="radio" name="gender" value="other"> Other
	  		</p>
	  		<button type="submit">Complete Registration</button>
		</form>
	</div>
</body>
</html>