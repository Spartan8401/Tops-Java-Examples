<%@page import="com.dao.StudentDao"%>
<%@page import="com.bin.Student"%>
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
           <td><b>Id</b></td>
           <td><b>BookName</b></td>
           <td><b>AuthorName</b></td>
           <td><b>Quntity</b></td>
           <td><b>Prize</b></td>
           <td><b>IssueDate</b></td>
           <td><b>SubmiteDate</b></td>
          
           <td><b>Edit</b></td>
           <td><b>Delete</b></td>
           </tr>
           
           <%
             for(Student s:list){
            %><tr>
                <td><%=s.getId() %></td>
                <td><%=s.getBname() %></td>
                <td><%=s.getAname() %></td>
                <td><%=s.getQuntity() %></td>
                <td><%=s.getPrize()%></td>
                 <td><%=s.getIssuedate()%></td>
                  <td><%=s.getSubmitedate()%></td>
                
               
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
<a href="Insert.jsp">Add New Book</a>
</body>
</html>