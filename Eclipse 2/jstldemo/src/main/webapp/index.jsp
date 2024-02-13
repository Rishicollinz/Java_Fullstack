<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL demo</title>
</head>
<body>
	<c:set var="name" />
	<c:out value="${name}">no name</c:out>
	<c:out value="${'Hello world!'}"/>

</body>
</html>