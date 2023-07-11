<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add user</title>
</head>
<body>
	<h1>Add User</h1>
	
	<form method="post" action="/jsp/user/add">
		<label>Name: </label><input type="text" name="name"><br>
		<label>D.O.B.: </label><input type="text" name="birthday"><br>
		<label>Email: </label><input type="text" name="email"><br>
		<label>Introduction: </label><br>
		<textarea rows="5" cols="50" name="intro"></textarea>
		<button type="submit">Add</button>
	</form>
	
	
</body>
</html>