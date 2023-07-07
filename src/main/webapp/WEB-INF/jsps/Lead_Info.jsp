<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Menu_Page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INFO PAGE</title>

</head>
<body>
	<h2>Get Info Here...</h2>
	<form>
		<table border = "1">
			<tr>
				<th>FIRSTNAME</th>
				<th>LASTNAME</th>
				<th>EMAILID</th>
				<th>MOBILENO</th>
				<th>SOURCE</th>
			</tr>
			<tr>
				<td>${lead.firstName}</td>
				<td>${lead.lastName}</td>
				<td>${lead.emailId}</td>
				<td>${lead.mobileNo}</td>
				<td>${lead.source}</td>
			</tr>
		</table>
	</form>
	<form action="processEmail" method="post">
		<table>
			<tr>
				<td><input type="hidden" name="emailId" value="${lead.emailId}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="sendEmail"></td>
			</tr>
		</table>
	</form>
	<form action="convertInfo" method="post">
		<table>
			<tr>
				<td><input type="hidden" name="id" value="${lead.id}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="convert"></td>
			</tr>
		</table>
	</form>
</body>
</html>