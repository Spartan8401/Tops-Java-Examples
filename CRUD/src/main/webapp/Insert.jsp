<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student1</title>
</head>
<body>
<b style="color:red;">
<%
    if(request.getAttribute("msg")!=null){
    	out.println(request.getAttribute("msg"));
    }
%>
</b>
 <form  name="insert"  method="post" action="StudentController">
 <table>
    <tr>
    <td>First Name</td>
    <td><input type="text" name="fname"></td>
    </tr> 
    
    <tr>
    <td>Last Name</td>
    <td><input type="text" name="lname"></td>
    </tr> 
    
    <tr>
    <td>Email</td>
    <td><input type="text" name="email"></td>
    </tr> 
    
      <tr>
    <td>Mobile</td>
    <td><input type="text" name="mobile"></td>
    </tr> 
    
    <tr>
    <td>Address</td>
    <td><textarea cols="21" rows="5"  name="address"></textarea></td>
    </tr> 
    
    
    <tr>
    <td>Gender</td>
    <td>
        <input type="radio" name="gender" value="male">Male
        <input type="radio" name="gender" value="female">Female        
    </td>  
    </tr> 
    
    <tr>
    <td  colspan="2"  align="center">
    <input type="submit" name="action" value="Insert"></td>
    </tr> 
    
     
      
 </table>
 </form>
</body>
</html>