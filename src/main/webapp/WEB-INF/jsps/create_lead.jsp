<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
</head>
<body>
	<h2>Create | Lead</h2>
	<form action="savelead" method="post">
		<pre>
			First Name<input type="text" name="firstName">
			Last Name <input type="text" name="lastName">
			Email	  <input type="email" name="email">
			Mobile	  <input type="number" name="mobile">
			Source:-  <select name="source">
				  <option value="newspaper">News Paper</option>
				  <option value="tvcommercial">TV Commercial</option>
				  <option value="online">Online</option>
				  <option value="seminar">Seminar</option>
				</select>
			<input type="Submit" value="Save">
		</pre>
	</form>
</body>
</html>