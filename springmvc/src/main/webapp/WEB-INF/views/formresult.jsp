<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${data1}</h1>
<h1>${data2}</h1>
<h3>User Id = ${user.userid}</h3>
<h3>User name = ${user.username}</h3>
<h3>User email = ${user.usermail}</h3>
<h3>User password = ${user.userpassword}</h3>
<h3>User occupation = ${user.useroccupation}</h3>
<h3>News letters = ${user.newsletters}</h3>
<h3>Agree term = ${user.agreeterm}</h3>
<h3>City = ${user.address.city}</h3>
<h3>State = ${user.address.state}</h3>
<h3>Country = ${user.address.country}</h3>
<h3>Postal Code = ${user.address.postalCode}</h3>
</body>
</html>