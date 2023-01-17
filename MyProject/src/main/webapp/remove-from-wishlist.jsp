<%@page import="java.util.List"%>
<%@page import="com.dao.WishListDao"%>
<%@page import="com.bean.Wishlist"%>
<%@ include file="header.jsp" %>


<%
    int pid=Integer.parseInt(request.getParameter("pid"));
    int uid=u.getUid();
    Wishlist w=new Wishlist();
    w.setPid(pid);
    w.setUid(uid);
    WishListDao.remove_from_wishlist(w);
    List<Wishlist> list=WishListDao.getWishlistsByUser(u.getUid());
    int wishlist_count=list.size();
     session.setAttribute("wishlist_count", wishlist_count);   
    response.sendRedirect("wishlist.jsp");
%>