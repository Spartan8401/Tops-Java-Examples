<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<b style="color:red;">
<%
    if(request.getAttribute("msg")!=null){
    	out.println(request.getAttribute("msg"));
    }
%>
</b>
<form name="filter"  method="post" action="Servlet3">
       <tr>
           <td>User Name</td>
           <td><input type="text" name="uname"></td>
       </tr>   
         
        <tr>
           <td>Password</td>
           <td><input type="password" name="password"></td>
       </tr>   
        <tr>
           <td colspan="2" align="center">
           <input type="submit" name="action" value="login"></td>
       </tr>    
           
</form>
</body>
</html>