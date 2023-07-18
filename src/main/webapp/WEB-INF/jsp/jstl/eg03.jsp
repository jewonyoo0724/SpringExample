<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl format library</title>
</head>
<body>
	
	<h1>JSTL Format Library</h1>
	
	<h3>Printing number</h3>
	<c:set var="number" value="123456789"/>
	<!--  <h4>${number }</h4>-->
	<h4><fmt:formatNumber value="${number }" /></h4>
	
	<h3>Percent</h3>
	<h4><fmt:formatNumber value="0.43" type="percent"/></h4>
	<h4><fmt:formatNumber value="${2/6 }" type="percent"/></h4>

	<h3>Currency</h3>
	<h4><fmt:formatNumber value="${number }" type="currency" /></h4>
	<h4><fmt:formatNumber value="${number }" type="currency" currencySymbol="₩" /></h4>
	
	<h3>Decimal</h3>
	
	<c:set var="pi" value="3.14150264365" />
	<h4><fmt:formatNumber value="${pi }" pattern="#.##" /></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="0.000000000000000"/></h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.###############"/></h4>
	
	<fmt:formatNumber value="${pi }" pattern="#.##" var="pi2"/>
	<h4>${pi2 }</h4>
	
	<h3>Date format</h3>
	<h4>${now }</h4>
	<h4><fmt:formatDate value="${now }" pattern="yyyy-MM-dd HH:mm:ss"/></h4>
	
	<%--2023/07/14 20:53:12 --%>
	<%--2023-07-14 8:53:12 --%>
	
	<%-- String -> Date -> String --%>
	<fmt:parseDate value="${dateString }" var="date" pattern="yyyy/MM/dd HH:mm:ss" />
	<h4>${date }</h4>

</body>
</html>