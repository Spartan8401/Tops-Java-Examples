<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<%
   Student s=(Student)request.getAttribute("s");
%>

<form name="insert" method="post" action="update">
       <table>
       <tr>
       <td><input type="hidden" name="id" value="<%=s.getId()%>"></td>
       <tr>
       <td>First Name</td>
       <td><input type="text" name="fname" value="<%=s.getFname() %>" ></td>
       </tr>
        <tr>
       <td>Last Name</td>
       <td><input type="text" name="lname" value="<%=s.getLname() %>"></td>
        <tr>
       <td>Email</td>
       <td><input type="text" name="email" value="<%=s.getEmail() %>"></td>
       </tr>
       <tr>
       <tr>
       <td colspan="2" align="center">
       <input type="submit" name="action" value="update">
       </td>
       </tr>
</table>
</form>
<a href="show.jsp">Show All Student</a>
</body>
</html>