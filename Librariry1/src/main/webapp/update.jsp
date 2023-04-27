<%@page import="com.bin.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student1</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<%
      Student s=(Student)request.getAttribute("s");
%>
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
        <td><input type="hidden" name="id" value="<%=s.getId() %>"></td>
     </tr>
    
    <tr>
    <td>Book Name</td>
    <td><input type="text" name="bname"  value="<%=s.getBname() %>"></td>
    </tr> 
    
    <tr>
    <td>Author Name</td>
    <td><input type="text" name="aname"  value="<%=s.getAname() %>"></td>
    </tr> 
    
    <tr>
    <td>Quntity</td>
    <td><input type="text" name="quntity"   value="<%=s.getQuntity() %>"></td>
    </tr> 
    
      <tr>
    <td>Prize</td>
    <td><input type="text" name="prize"  value="<%=s.getPrize() %>"></td>
    </tr> 
    
    
    
   
    
    <tr>
    <td  colspan="2"  align="center">
    <input type="submit" name="action" value="update"></td>
    </tr> 
    
     
      
 </table>
 <a href="Show.jsp">Show ALL BOOK</a>
 </form>
</body>
</html>