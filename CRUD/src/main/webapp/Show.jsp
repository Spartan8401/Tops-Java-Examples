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
</head>
<body>
<%
     List<Student> list=StudentDao.getAllStudents();
 %>
<table border="2" width="100%" cellpading="10px" cellspacing="10px">
        <tr>
           <td>Id</td>
           <td>FirstName</td>
           <td>LastName</td>
           <td>Email</td>
           <td>Mobile</td>
           <td>Address</td>
           <td>Gender</td>
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
                <td><%=s.getMobile() %></td>
                </tr>
            <% 	 
             }
           %>
           
</table>
</body>
</html>