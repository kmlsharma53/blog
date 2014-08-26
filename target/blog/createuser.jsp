<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New user registration</title>
<script type="text/javascript" src="js/validation.js">
</script>
</head>
<body bgcolor="#E6E6FA">
<center>
<strong><b>Please enter below details</b></strong>
<form name="userform" method="post" action="createuser.htm" onSubmit="return validate()">
  <table>  
   <tr>  
    <td>User:</td>  
    <td><input type='text' name='j_username' placeholder="user" required>  
    </td>  
   </tr>  
   <tr>  
    <td>Password:</td>  
    <td><input type='password' name='j_password' placeholder="password" required/>  
    </td>  
   </tr>
   <tr>  
    <td>E-mail:</td>  
    <td><input type="email" name="email" required>  
    </td>  
   </tr>  
   </table> 
    <input name="submit" type="submit"  
     value="submit" />  
    <input name="reset" type="reset" />  
 </form>
</center>
</body>
</html>