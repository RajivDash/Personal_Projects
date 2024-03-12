<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file = "menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>

<body>
	<h2>Update Here...</h2>
	<div>
		<%
		if (request.getAttribute("msg") != null) {
			out.println(request.getAttribute("msg"));
		}
		%>
	</div>
	<form action="update" method="post">
		<table border="1">
			<tr>
				<td>EmailId</td>
				<td><input type="text" name="email" value = "<%=request.getAttribute("email")%>"></td>
			</tr>
			<tr>
				<td>PhoneNo</td>
				<td><input type="text" name="phone" value = "<%=request.getAttribute("phone")%>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="update"></td>
			</tr>

		</table>
	</form>
</body>
</html>