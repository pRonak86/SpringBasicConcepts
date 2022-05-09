<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="addStudent">Add Student</a>
<h2 align="center"> All Record of the Student</h2>
	<table border="1" align="center">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>City</th>
			<th>Degree</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.sid }</td>
				<td>${list.sname}</td>
				<td>${list.city }</td>
				<td>${list.degree }</td>
				<td><a href="editstudent/${list.sid }">Edit</a></td>
				<td><a href="deletestudent/${list.sid }">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>	