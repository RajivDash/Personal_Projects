<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>

<body>
	<h2>Login Here</h2>
	<div>
		<%
		if (request.getAttribute("Error") != null) {
			out.println(request.getAttribute("Error"));
		}
		%>
	</div>
	<form action="VerifyLogin" method="post">
		<table>
			<tr>
				<td>EmailId</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>