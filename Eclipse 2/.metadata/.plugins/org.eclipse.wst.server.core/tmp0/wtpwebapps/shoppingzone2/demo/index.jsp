<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>welcome page</title>
</head>

<body bgcolor="silver">
    <h1>Welcome.</h1>
    <form action="LogoutAction" method="post">
        <input type="submit" value="logout">
    </form>
   <%
    if(session.getAttribute("userName")==null)
    { 
      response.sendRedirect("LoginPage.jsp");
    } %>
</body>
 
</html>