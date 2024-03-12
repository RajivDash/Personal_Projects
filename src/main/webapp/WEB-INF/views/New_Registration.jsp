<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file = "menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>

<body>
	<h2>Register Here...</h2>
	<div>
		<%
		if (request.getAttribute("msg") != null) {
			out.println(request.getAttribute("msg"));
		}
		%>
	</div>
	<form action="save" method="post">
		<table border="1">
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>EmailId</td>
				<td><input type="text" name="emailid"></td>
			</tr>
			<tr>
				<td>PhoneNo</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"></td>
			</tr>

		</table>
	</form>
</body>
</html>