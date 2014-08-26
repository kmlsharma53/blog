<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link rel="stylesheet" type="text/css" href="./css/main.css"/>
<title>Login</title>
</head>
<body bgcolor="#E6E6FA">
<h3 class="h3">
<center><header><strong><b>Welcome to the Blog World</b></strong></header>
<br/><br/><br/><br/>

<i><b>Registered user</b></i> 
 <form name="userform" method="post" action='<c:url value='/j_spring_security_check'/>'> 

  <table>  
   <tr>  
    <td>User:</td>  
    <td><input type='text' name='j_username' placeholder="user">  
    </td>  
   </tr>  
   <tr>  
    <td>Password:</td>  
    <td><input type='password' name='j_password' placeholder="password"/>  
    </td>  
   </tr>  
   </table> 
    <input name="submit" type="submit"  
     value="submit" />  
    <input name="reset" type="reset" />  
 </form>
 <br/><br/>
 <i><b>New user</b></i>
 <br/>
 <input type="button"  onclick="window.location='/blog/createuser.jsp'" value="Create Account"/>
 </center>
</h3>
</body>
</html>
