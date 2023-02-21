<%@page import="com.controller.ProductDao1"%>
<%@page import="com.util.ProjectUtil"%>
<%
   int pid=Integer.parseInt(request.getParameter("pid"));
   ProductDao1.deleteProductsByPid(pid);
   response.sendRedirect("seller-view-product.jsp");
%>