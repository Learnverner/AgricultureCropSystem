<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:errors path="login1.*" />
  <form action="result.html">
    <table>
    
    <tr>
				<td>Username :</td> <td>  <input type:"text" name = "username" /></td>
			</tr>
			<tr>
				<td>Password :  </td> <td> <input type:"text" name = "password" /></td>
			</tr>
			<tr><td><input type="submit" value="Sign In" /></td></tr>
			
		</table>
  
  
  </form>
</body>
</html>