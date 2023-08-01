<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>new user input</title>
</head>
<body>

	<h1>Add User</h1>
	
	<label>Name: </label><input type="text" name="name" id="nameInput"><br>
	<label>D.O.B.: </label><input type="text" name="birthday" id="birthInput"><br>
	<label>Email: </label><input type="text" name="email" id="emailInput">
	<button type="button" id="duplicateBtn">Duplicate Check</button><br>
	<label>Introduction: </label><br>
	<textarea rows="5" cols="50" name="introduce" id="introInput"></textarea>
	<button type="button" id="addBtn" >Add</button>
	
	<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
	
	<script>
		$(document).ready(function() {
			
			$("#addBtn").on("click", function(){
				// validity test
				let name = $("#nameInput").val();
				let birthday = $("#birthInput").val();
				let email = $("#emailInput").val();
				let intro = $("#introInput").val();
				
				if(name == "")
				{
					alert("Enter name");
					return;
				}
				if(birthday == "")
				{
					alert("Enter birthday");
					return;
				}
				if(email == "")
				{
					alert("Enter email");
					return;
				}
				if(intro == "")
				{
					alert("Enter introduction");
					return;
				}
				//if no empties
				$.ajax({
					type:"get",
					url:"/ajax/user/add",
					data:{"name":name, "birthday":birthday, "email":email, "introduce":intro},
					success:function(data){
						if(data.result == "success")
						{
							location.href="/ajax/user/list";
						}
						else
						{
							alert("Input fail");
						}
					},
					error:function(){
						alert("Input error");
					}
				});
			});
			
		});
	</script>

</body>
</html>