<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration page</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>

<%
	String username=request.getParameter("usr");
	String password=request.getParameter("pwd");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	final String db_url="jdbc:mysql://localhost:3306/db3";
    final String user="root";
    Connection con=null;
    con=DriverManager.getConnection(db_url, user, "");
    
    String qry="insert into users(username,password) values(?,?)";
	PreparedStatement prt=con.prepareStatement(qry);
	prt.setString(1,username);
	prt.setString(2,password);
	prt.executeUpdate();
	
%>

</body>
</html>