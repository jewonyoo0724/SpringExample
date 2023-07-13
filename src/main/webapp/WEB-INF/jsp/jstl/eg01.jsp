<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- core tag -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core library</title>
</head>
<body>

	<h1>JSTL Core</h1>
	
	<h3>Creating variable</h3>
	
	<%-- int number = 100; --%>
	<c:set var="number1" value="100"/>
	<%-- int number = 200; --%>
	<c:set var="number2">200</c:set>
	
	<h4>Number 1: ${number1}</h4>
	<h4>Number 2: ${number2}</h4>
	
	<h3>Printing variable</h3>
	
	<h4>Number 1: <c:out value="100"/></h4>
	<h4>Number 2: <c:out value="${number2 }"/></h4>
	
	<%-- <script> alert("hello") </script> --%>
	<c:out value="<script> alert('hello') </script>" escapeXml="true"/>
	<!-- want to show tag itself: escapeXml="true", but if want tag to work: true(default)-->
	
	<h3>Conditionals</h3>
	<%-- if (true or false) --%>
	<c:if test="true">
		<h4>Paul Pierce is the Truth.</h4>
	</c:if>
	
	<%--if (number1 > 50) --%>
	<c:if test="${number1 gt 50}"> <!-- > as gt -->
		<h4>Number 1 is greater than 50</h4>
	</c:if>
	
	<%--if (number1 == 100) --%>
	<c:if test="${number1 eq 100 }"> <!-- == as eq -->
		<h4>Number 1 = 100</h4>
	</c:if>
	
	<%-- if (number1 != 100) --%>
	<c:if test="${number1 ne 100 }"> <!-- != as ne -->
		<h4>number1 != 100</h4>
	</c:if>
	
	<%-- if (number3 == null) --%>
	<!-- empty: null, no variable, list is empty, map is empty, etc (simply, nothing to display) -->
	<c:if test="${empty number3 }">
		<h4>number3 is empty</h4>
	</c:if>
	
	<c:if test="${not empty number2 }">
		<h4>number2 is not empty</h4>
	</c:if>
	

</body>
</html>