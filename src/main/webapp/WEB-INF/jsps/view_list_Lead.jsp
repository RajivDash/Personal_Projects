<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="Menu_Page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GET ALL-LIST HERE</title>
</head>
<table border = "1">
	<tr>
		<th>FIRSTNAME</th>
		<th>LASTNAME</th>
		<th>EMAILID</th>
		<th>PHONENO</th>
		<th>SOURCE</th>
	</tr>
	<c:forEach var="lead" items="${Leads}">
		<tr>
			<td><a href="leadinfo?id=${lead.id}">${lead.firstName}</a></td>
			<td>${lead.lastName}</td>
			<td>${lead.emailId}</td>
			<td>${lead.mobileNo}</td>
			<td>${lead.source}</td>
		</tr>
	</c:forEach>
</table>
<body>

</body>
</html>