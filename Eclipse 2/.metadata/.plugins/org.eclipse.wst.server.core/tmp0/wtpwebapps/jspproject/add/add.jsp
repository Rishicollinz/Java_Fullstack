<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

</head>

<body>

<div class="container-fluid p-5 bg-primary text-white text-center">
  <h1>Add Employee</h1>
</div>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>

<%
String empname=request.getParameter("empName");
String dob=request.getParameter("dob");
String bldgrp=request.getParameter("bloodgrp");
String email=request.getParameter("email");
String contact=request.getParameter("contact");
String address=request.getParameter("address");
String dept=request.getParameter("deptName");
String role=request.getParameter("role");
String proj=request.getParameter("proj");
String doj=request.getParameter("doj");
String stat=request.getParameter("status");

Class.forName("com.mysql.cj.jdbc.Driver");
final String db_url="jdbc:mysql://localhost:3306/jspproject";
final String user="root";
Connection con=null;
con=DriverManager.getConnection(db_url, user, "");

String qry="INSERT INTO `employee`(`name`, `dob`, `bloodgroup`, `email`, `contact`, `address`, `department`, `role`, `project`, `doj`, `status`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
PreparedStatement prt=con.prepareStatement(qry);
prt.setString(1,empname);
prt.setString(2,dob);
prt.setString(3,bldgrp);
prt.setString(4,email);
prt.setString(5,contact);
prt.setString(6,address);
prt.setString(7,dept);
prt.setString(8,role);
prt.setString(9,proj);
prt.setString(10,doj);
prt.setString(11,stat);
int s=prt.executeUpdate();

if(s>0){
	%>
	<br>
	<div class="container-fluid p-5 bg-primary text-white text-center">
  		<h1>Employee added successfully</h1>
	</div>
	<% 
}else{
	%>
	<div class="container-fluid p-5 bg-primary text-white text-center">
  		<h1>Employee addition failed</h1>
	</div>
	<% 
}
%>
</body>
</html>