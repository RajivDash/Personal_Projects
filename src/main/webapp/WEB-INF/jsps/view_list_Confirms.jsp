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
		<th>BILLING</th>
	</tr>
	<c:forEach var="convert" items="${converts}">
		<tr>
			<td>${convert.firstName}</td>
			<td>${convert.lastName}</td>
			<td>${convert.emailId}</td>
			<td>${convert.mobileNo}</td>
			<td>${convert.source}</td>
			<td><a href = "generateBill?id=${convert.id}">Bill</a></td>
		</tr>
	</c:forEach>
</table>
<body>

</body>
</html>