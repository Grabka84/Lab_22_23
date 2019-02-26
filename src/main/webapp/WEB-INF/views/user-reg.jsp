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

<div class = "container">
	<div class = "navbar">
		<a href="/"><button class ="navbut" type="button">Home</button></a>
		<a href="/user-menu"><button class ="navbut" type="button">Users</button></a>
		<a href="/item-menu"><button class ="navbut" type="button">Inventory</button></a>
		<a href="/about"><button class ="navbut" type="button">About Us</button></a>
		<a href="/contact"><button class ="navbut" type="button">Contact Us</button></a>
	</div>

	<div class = "form">
		<h2>User Registration Form</h2>
		<form action="/user-confirm" method="post">
			<p><label>First Name</label><br>
				<input name="fname" type="text" required/></p>
			<p><label>Last Name</label><br>
				<input name="lname" type="text" required/></p>
			<p><label>Phone Number in the format (555) 555-5555</label><br>
				<input name="pnum" type="tel" placeholder="(555) 555-5555" pattern="\(\d{3}\)\s\d{3}-\d{4}"/></p>
			<p><label>E-Mail</label><br>
				<input name="uemail" type="email"/></p>
			<p><label>Date of Birth</label><br>
				<input name="uyear" type="date" min="1900-01-01" max="2019-01-01"/></p>
			<p>
				<input type="radio" name="gender" value="male" checked> Male<br>
	 			<input type="radio" name="gender" value="female"> Female<br>
	  			<input type="radio" name="gender" value="other"> Other
	  		</p>
	  		<button type="submit">Complete Registration</button>
		</form>
	</div>
</div>
</body>
</html>