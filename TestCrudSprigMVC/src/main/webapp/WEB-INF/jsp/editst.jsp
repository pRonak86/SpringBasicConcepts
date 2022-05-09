<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="../editUp" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="sname" value="${stu.sname }"></td>
			</tr>
			<tr>
				<td>city</td>
				<td><input type="text" name="city" value="${stu.city }"></td>
			</tr>
			<tr>
				<td>Degree</td>
				<td><input type="text" name="degree" value="${stu.degree }">
					<input type="hidden" name="sid" value="${stu.sid }">
				</td>
			</tr>
			<tr>
				<td>	
					<input type="submit" value="Update">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>