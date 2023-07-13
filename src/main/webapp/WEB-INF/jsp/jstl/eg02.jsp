<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>eg02</title>
</head>
<body>

	<h2> Conditionals & Loops</h2>
	
	<h2>if, else if, else</h2>
	
	<c:set var="weight" value="70" />
	
	<c:choose>
		<c:when test="${weight le 70 }">
			<h4>chicken</h4>
		</c:when>
		<c:when test="${weight le 80 }">
			<h4>Salad</h4>
		</c:when>
		<c:otherwise>
			<h4>Starve</h4>
		</c:otherwise>
	</c:choose>
	
	<h2>Loops</h2>
	<%-- for(int i = 0; i < 5; i++) --%>
	<c:forEach var="i" begin="0" end="4" step="1">
		${i }<br>
	</c:forEach>
	
	<c:forEach var="fruit" items="${fruitList }" varStatus="status">
		${fruit }::${status.count }::${status.index }::${status.first}::${status.last }<br>
	</c:forEach>
	
</body>
</html>