<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet"/>
<script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>
</head>
<body>
	<h1>${data1}</h1>
	<h1>${data2}</h1>
	<h1 style="text-align: center">Hi ${name}</h1>
	<img alt="logo" src="<c:url value="/resources/images/logo.jpg"/>">

</body>
</html>