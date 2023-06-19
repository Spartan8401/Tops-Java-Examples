<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="insert" method="post" action="StudentController">
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
          <td>Email</td>
          <td><input  type="text" name="email"></td>
         
       </tr>
      
       <tr>
          <td>Subject</td>
          <td><input  type="text" name="subject"></td>
         
       </tr>
       <tr>
          <td>Type</td>
          <td><input  type="text" name="type"></td>
         
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