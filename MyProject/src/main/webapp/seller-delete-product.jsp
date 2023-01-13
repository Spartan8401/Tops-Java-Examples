<%@page import="com.dao.ProductDao"%>
<%@page import="com.util.ProjectUtil"%>
<%
   int pid=Integer.parseInt(request.getParameter("pid"));
   ProductDao.deleteProductsByPid(pid);
   response.sendRedirect("seller-view-product.jsp");
%>