<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Menu_Page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LEAD PAGE</title>
</head>

<body>
	<h2 align="center">Register Here...</h2>
	<form action="save" method="post">
		<table align="center">
			<tr>
				<td>FIRSTNAME</td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td>LASTNAME</td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td>EMAILID</td>
				<td><input type="text" name="emailId"></td>
			</tr>
			<tr>
				<td>MOBILENO</td>
				<td><input type="text" name="mobileNo"></td>
			</tr>
			<tr>
				<td>SOURCE</td>
				<td><select name="source">
						<option value="radio">radio</option>
						<option value="newsPaper">newsPaper</option>
						<option value="tradeShop">tradeShop</option>
						<option value="website">website</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"></td>
			</tr>
		</table>
	</form>
</body>
</html>