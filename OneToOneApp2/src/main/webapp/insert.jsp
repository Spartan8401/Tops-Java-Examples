<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="insert" method="post" action="EmployeeController">
  <table>
       <tr>
          <td>First Name </td>
          <td><input  type="text" name="fname"></td>
         
       </tr>
       
       <tr>
          <td>Last Name </td>
          <td><input  type="text" name="lname"></td>
         
       </tr>
       <tr>
          <td>Mobile</td>
          <td><input  type="text" name="mobile"></td>
         
       </tr>
       <tr>
          <td>Address</td>
          <td><textarea cols="22" rows="5" name="address"></textarea></td>
         
       </tr>
       <tr>
          <td>User Name </td>
          <td><input  type="text" name="uname"></td>
         
       </tr>
       <tr>
          <td>Password </td>
          <td><input  type="password" name="password"></td>
         
       </tr>
       <tr>
        
       <td colspan="2" align="center">
       <input type="submit" name="action" value="Insert" class="btn btn-primary">
       </td> 
       </tr>
  </table>
  <a href="Show.jsp">Show All Students</a>
</form>

</body>
</html>