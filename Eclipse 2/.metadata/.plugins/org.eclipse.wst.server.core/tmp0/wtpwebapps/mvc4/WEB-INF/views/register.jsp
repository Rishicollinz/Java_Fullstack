<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<form action="/mvc4/registerSuccess" method="post">
Enter the name:<input type="text" name="name"/>
Enter the age:<input type="text" name="age"/>
Enter the email:<input type="text" name="email"/>
Choose the country:
<select name="country">
<option value="india">India</option>
<option value="us">US</option>
<option value="uk">UK</option>
<option value="other">Other</option>
</select>
<input type="submit" value="Register"></input>
</form>
</body>
</html>