<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy.MM.dd");
LocalDate ld=LocalDate.now();
out.print(dtf.format(ld));
%>
</body>
</html>