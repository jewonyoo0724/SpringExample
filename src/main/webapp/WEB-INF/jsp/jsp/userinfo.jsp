<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user info</title>
</head>
<body>
	
	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>Name</th>
				<th>Birthday</th>
				<th>Email</th>
				<th>Introduction</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${result.id}</td>
				<td>${result.name}</td>
				<td>${result.yyyymmdd}</td>
				<td>${result.email}</td>
				<td>${result.introduce}</td>
			</tr>
		</tbody>
	</table>

</body>
</html>