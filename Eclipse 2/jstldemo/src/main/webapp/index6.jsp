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
<c:forTokens items="My-Name-is-Jack-sparrow" delims="-" var="del">
Word<c:out value="${del }"></c:out>
</c:forTokens>

</body>
</html>