<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login check</title>
<style>
table, th, td {
  border:1px solid black;
}
</style>
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
	
	String qry="Select * from users where username=? and password=?";
	PreparedStatement prt=con.prepareStatement(qry);
	prt.setString(1,username);
	prt.setString(2,password);
	ResultSet rs=prt.executeQuery();
	if(rs.next()){
		out.println("Welcome "+rs.getString(2));
		
	}else{
		out.println("Invalid Username or password");
	}
%>
</body>
</html>