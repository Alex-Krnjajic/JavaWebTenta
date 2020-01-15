<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form action="<%= request.getContextPath() %>/AnAnimalForm" method="post">
<input type="radio" name="animal" value="1" >moo<br>
<input type="radio" name="animal" value="2"> meow<br>
<input type="radio" name="animal" value="3"> bark<br>
<input type="radio" name="animal" value="4"> AAAAAAAAAAAAAAAAAAAAAAAAA<br>

<input type="submit" value="submit">
</form>
</body>
</html>