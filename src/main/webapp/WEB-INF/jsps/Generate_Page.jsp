<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Menu_Page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILLING PAGE</title>
</head>

<body>
	<h2 align="center">Billing Details...</h2>
	<form action="generate" method="post">
		<table align="center">
			<tr>
				<td>FIRSTNAME</td>
				<td><input type="text" name="firstName"
					value="${convert.firstName}"></td>
			</tr>
			<tr>
				<td>LASTNAME</td>
				<td><input type="text" name="lastName"
					value="${convert.lastName}"></td>
			</tr>
			<tr>
				<td>EMAILID</td>
				<td><input type="text" name="emailId"
					value="${convert.emailId}"></td>
			</tr>
			<tr>
				<td>MOBILENO</td>
				<td><input type="text" name="mobileNo"
					value="${convert.mobileNo}"></td>
			</tr>
			<tr>
				<td>PRODUCT</td>
				<td><input type="text" name="product"></td>
			</tr>
			<tr>
				<td>AMMOUNT</td>
				<td><input type="text" name="amount"></td>
			</tr>
	<tr>
	<td><input type="hidden" name="id" value="${convert.id}"></td>
	</tr>
	<tr>
		<td><input type="submit" value="GenerateBill"></td>
	</tr>
	</table>
	</form>
</body>
</html>