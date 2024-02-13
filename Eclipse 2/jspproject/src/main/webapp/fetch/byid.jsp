<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fetch Employee By Id</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<style>
table, th, td {
  border:1px solid black;
}
</style>
</head>

<body>

<div class="container-fluid p-5 bg-primary text-white text-center">
  <h1>Fetch Employee By Id</h1>
</div>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<table style="width:100%">
  <tr>
    <th>Employee Id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Role</th>
    <th>Project</th>
    <th>Department</th>
    <th>Contact Number</th>
   <tr>
<%
int id=Integer.parseInt(request.getParameter("empId"));

Class.forName("com.mysql.cj.jdbc.Driver");
final String db_url="jdbc:mysql://localhost:3306/jspproject";
final String user="root";
Connection con=null;
con=DriverManager.getConnection(db_url, user, "");

String qry="Select * from employee where empid=?";
PreparedStatement prt=con.prepareStatement(qry);
prt.setInt(1,id);
ResultSet rs=prt.executeQuery();
boolean chk=false;
while(rs.next()){
	chk=true;
	%>
	
   <tr>
			<td><%=rs.getInt(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(5) %></td>
			<td><%=rs.getString(9) %></td>
			<td><%=rs.getString(10) %></td>
			<td><%=rs.getString(8) %></td>
			<td><%=rs.getString(6) %></td>
			
	</tr>
<%	
}
if(chk==false){
	%>
	<p>No data found</p>
	<%
}
%>
</body>
</html>