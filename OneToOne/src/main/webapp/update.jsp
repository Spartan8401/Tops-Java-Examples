<%@page import="com.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<%
    Student s=(Student)request.getAttribute("e");
%>

<form name="update" method="post" action="StudentController">
  <table>
  
       <tr>
          <td><input  type="hidden" name="sid" value="<%=s.getSid()%>"></td>
         
       </tr>
       <tr>
          <td>First Name </td>
          <td><input  type="text" name="fname" value="<%=s.getId().getFname()%>"></td>
         
       </tr>
       
       <tr>
          <td>Last Name </td>
          <td><input  type="text" name="lname" value="<%=s.getId().getLname()%>"></td>
         
       </tr>
       <tr>
          <td>Email</td>
          <td><input  type="text" name="email" value="<%=s.getId().getEmail()%>"></td>
         
       </tr>
       <tr>
          <td>Subject</td>
          <td><input  type="text" name="subject" value="<%=s.getSubject()%>"></td>
         
       </tr>
       <tr>
          <td>Type</td>
          <td><input  type="text" name="type" value="<%=s.getType()%>"></td>
         
       </tr>
       
       <tr>
        
       <td colspan="2" align="center">
       <input type="submit" name="action" value="Update" class="btn btn-primary">
       </td> 
       </tr>
  </table>
<a href="Show.jsp">Show All Students</a>
</form>
</body>
</html>