<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Menu_Page.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email Page</title>
</head>

<body>
	<h2 align="center">Compose here...</h2>
	${msg}
	<form action="triggerEmail" method="post">
		<table align="center">
			<tr>
				<th>To</th>
				<td><input type="text" name="emailId" value="${emailId}"></td>
			</tr>
			<tr>
				<th>Subject</th>
				<td><input type="text" name="subject"></td>
			</tr>
			<tr>
				<th>Content</th>
				<td><br> <textarea name="content" rows="10" cols="50">
	</textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="send"></td>
			</tr>
		</table>
	</form>
</body>
</html>