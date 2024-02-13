<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int i=Integer.parseInt(request.getParameter("t1"));
	int j=Integer.parseInt(request.getParameter("t2"));
	int k=i+j;
	response.sendRedirect("sq.jsp?ans="+k);
%>

</body>
</html>