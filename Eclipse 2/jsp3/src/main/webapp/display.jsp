<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<body>

<h2>Users table data:</h2>

<table style="width:100%">
  <tr>
    <th>Id</th>
    <th>Username</th>
    <th>Password</th>
   <tr>
   <%@ page import="java.sql.*" %>
	<%@ page import="javax.sql.*" %>
   <%
    Class.forName("com.mysql.cj.jdbc.Driver");
	final String db_url="jdbc:mysql://localhost:3306/db3";
	final String user="root";
	Connection con=null;
	con=DriverManager.getConnection(db_url, user, "");
	
	String qry="Select * from users";
	PreparedStatement prt=con.prepareStatement(qry);
	ResultSet rs=prt.executeQuery();
	
	while(rs.next()){
		%>
		<tr>
			<td><%=rs.getInt(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			
		</tr>
		<%
		
	}
   %>
</table>

</body>
</html>

