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
	int k=Integer.parseInt(request.getParameter("ans"));
	k=k*k;
	out.print("sq called");
	out.print("Result:"+k);
%>

</body>
</html>