<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Registration List</title>
</head>

<body>
	<h2>All Registration</h2>
	<table border='1'>
		<tr>
			<th>NAME</th>
			<th>CITY</th>
			<th>EMAILID</th>
			<th>PHONENO</th>
			<th>DELETE</th>
			<th>UPDATE</th>
		</tr>
		<%
		ResultSet result = (ResultSet) request.getAttribute("result");
		while (result.next()) {
		%>
		<tr>
			<td><%=result.getString(1)%></td>
			<td><%=result.getString(2)%></td>
			<td><%=result.getString(3)%></td>
			<td><%=result.getString(4)%></td>
			<td><a href="delete?email=<%=result.getString(3)%>">Delete</a></td>
			<td><a
				href="update?email=<%=result.getString(3)%>&phone=<%=result.getString(4)%>">Update</a></td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>