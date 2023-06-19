<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.StudentDao"%>
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
	<table border="1" width="100%" cellpadding="10px" cellspacing="10px">

		<tr>
			<td>Id</td>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Email</td>
			<td>Sid</td>
			<td>Subject</td>
			<td>Type</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<%
		  List<Student> list=StudentDao.getAllStudent();
		   for(Student s:list){
		%>
       <tr>
            <td><%=s.getId().getId()%></td>
            <td><%=s.getId().getFname()%></td>
            <td><%=s.getId().getLname() %></td>
            <td><%=s.getId().getEmail() %></td>
            <td><%=s.getSid() %></td>
             <td><%=s.getSubject() %></td>
              <td><%=s.getType() %></td>
            <td>
                <form name="edit" method="post" action="StudentController">
                <input type="hidden" name="sid" value="<%=s.getSid()%>">
                <input type="submit" name="action" value="EDIT" class="btn btn-primary"> 
                </form>
            </td>
            <td>
                <form name="delete" method="post" action="StudentController">
                <input type="hidden" name="sid" value="<%=s.getSid()%>">
                <input type="submit" name="action" value="DELETE" class="btn btn-danger"> 
                </form>
            </td>
       </tr>		
      <%}
	 %>
	</table>
<a href="insert.jsp">ADD New Student</a>
</body>
</html>