<%@page import="com.bin.Student"%>
<%@page import="com.dao.StudentDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<%
     List<Student> list=StudentDao.getAllStudents();
 %>
<table border="2" width="100%" cellpadding="10px" cellspacing="10px">
        <tr>
           <td>Id</td>
           <td>FirstName</td>
           <td>LastName</td>
           <td>Email</td>
           <td>Mobile</td>
           <td>Address</td>
           <td>Gender</td>
           <td>Edit</td>
           <td>Delete</td>
           </tr>
           
           <%
             for(Student s:list){
            %><tr>
                <td><%=s.getId() %></td>
                <td><%=s.getFname() %></td>
                <td><%=s.getLname() %></td>
                <td><%=s.getEmail() %></td>
                <td><%=s.getMobile() %></td>
                <td><%=s.getAddress() %></td>
                <td><%=s.getGender() %></td>
                <td>
                <form name="edit" method="post" action="StudentController">
                <input type="hidden" name="id" value="<%=s.getId() %>">
                <input type="submit" name="action" value="EDIT" class="btn btn-primary">
                </td>
                </form>
                <td>
                <form name="delete" method="post" action="StudentController">
                <input type="hidden" name="id" value="<%=s.getId() %>">
                <input type="submit" name="action" value="DELETE" class="btn btn-danger">
                </td>
                </tr>
                </form>
            <% 	 
             }
           %>
           
</table>
<a href="Insert.jsp">Add New Student</a>
</body>
</html>