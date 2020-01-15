<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>login</h1>
 <form action="<%= request.getContextPath() %>/LoginForm" method="post">

 
 <input type="text" name="username"><br> 
 <input type="password" name="password"><br>
  
  <br> 
  <input type="submit" value="register">
 </form>
</body>
</html>