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
	<h2 align = "center">Get GenerateBill Info Here...</h2>
	<form>
		<table align = "center" border = "1">
			<tr>
				<th>FIRSTNAME</th>
				<th>LASTNAME</th>
				<th>EMAILID</th>
				<th>MOBILENO</th>
				<th>PRODUCT</th>
				<Th>AMMOUNT</Th>
			</tr>
			<tr>
				<td>${bills.firstName}</td>
				<td>${bills.lastName}</td>
				<td>${bills.emailId}</td>
				<td>${bills.mobileNo}</td>
				<td>${bills.product}</td>
				<td>${bills.amount}</td>
			</tr>
		</table>
	</form>
	
</body>
</html>