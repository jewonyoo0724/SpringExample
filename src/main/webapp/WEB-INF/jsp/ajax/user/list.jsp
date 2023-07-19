<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
</head>
<body>
	
	<h1>User List</h1>
	
	<table border="1">
		<thead>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Introduction</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${userList }">
				<tr>
					<td>${user.name }</td>
					<td>${user.email }</td>
					<td>${user.introduce }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>