<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Blog World</title>
</head>
<body bgcolor="#E6E6FA">
  <h1>Hello ${user}</h1>
  <h1>Message : ${msg}</h1>
  <a href=<c:url value="/j_spring_security_logout"/>>Logout</a><br/>
</body>
</html>