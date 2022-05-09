<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Add Student Details</h1>
	<form action="save" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Degree</td>
				<td><input type="text" name="degree"></td>
			</tr>
			<tr>
				<td><input type="submit" value="ADD"></td>
			</tr>
		</table>
	</form>
	<a href="views">View All</a>
</body>
</html>