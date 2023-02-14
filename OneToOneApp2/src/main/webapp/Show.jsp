<%@page import="com.bean.EmployeeInfo"%>
<%@page import="com.bean.Employees"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.EmployeeDao"%>
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
			<td>Epid</td>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Address</td>
			<td>Mobile</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<%
		   List<EmployeeInfo> list=EmployeeDao.getAllEmployeeInfo(epid);
		
		   for(EmployeeInfo s:list){
		%>
       <tr>
            <td><%=s.getEpid() %></td>
            <td><%=s.getFname() %></td>
            <td><%=s.getLname() %></td>
            <td><%=s.getAddress() %></td>
            <td><%=s.getMobile() %></td>
            <td>
                <form name="edit" method="post" action="EmployeeController">
                <input type="hidden" name="id" value="<%=s.getEpid()%>">
                <input type="submit" name="action" value="EDIT" class="btn btn-primary"> 
                </form>
            </td>
            <td>
                <form name="delete" method="post" action="EmployeeController">
                <input type="hidden" name="id" value="<%=s.getEpid()%>">
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