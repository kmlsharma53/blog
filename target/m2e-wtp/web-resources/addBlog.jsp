<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Write your blog below</title>
</head>
<body>
	<form action="saveBlog" method ="post">
		 <table>  
		   <tr>  
		    <td>Enter blog here:</td>  
		    <td><input type='textarea' name='textArea' placeholder="enter text here">  
		    </td>  
		   </tr>  
		   </table> 
		    <input name="submit" type="submit"  
		     value="submit" />  
		    <input name="reset" type="reset" />  
	</form>
</body>
</html>