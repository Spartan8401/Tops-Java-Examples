<%@page import="com.dao.WishListDao"%>
<%@page import="com.bean.Wishlist"%>
<%@ include file="header.jsp" %>


<%
    int pid=Integer.parseInt(request.getParameter("pid"));
    int uid=u.getUid();
    Wishlist w=new Wishlist();
    w.setPid(pid);
    w.setUid(uid);
    WishListDao.add_to_wishlist(w);
    response.sendRedirect("wishlist.jsp");
%>