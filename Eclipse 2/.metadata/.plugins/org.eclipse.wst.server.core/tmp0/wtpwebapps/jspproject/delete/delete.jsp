<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete a employee</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

</head>

<body>

<div class="container-fluid p-5 bg-primary text-white text-center">
  <h1>Delete a employee</h1>
</div>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>

<%
int id=Integer.parseInt(request.getParameter("empId"));

Class.forName("com.mysql.cj.jdbc.Driver");
final String db_url="jdbc:mysql://localhost:3306/jspproject";
final String user="root";
Connection con=null;
con=DriverManager.getConnection(db_url, user, "");

String qry="DELETE FROM `employee` WHERE empid=?";
PreparedStatement prt=con.prepareStatement(qry);
prt.setInt(1,id);
int count=prt.executeUpdate();
if(count>0){
	%>
	<br>
	<div class="container-fluid p-5 bg-primary text-white text-center">
  		<h1>Employee deleted successfully</h1>
	</div>
	<% 
}else{
	%>
	<div class="container-fluid p-5 bg-primary text-white text-center">
  		<h1>There is no such employee id</h1>
	</div>
	<% 
}
%>
</body>
</html>