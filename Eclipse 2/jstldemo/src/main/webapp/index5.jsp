<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="iterator" begin="1" end="10" step="1">
Count:<c:out value="${iterator },${10-iterator}"/>
<br>
</c:forEach>


</body>
</html>