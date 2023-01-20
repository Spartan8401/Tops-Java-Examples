<%@page import="com.bean.Cart"%>
<%@page import="com.dao.CartDao"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.WishListDao"%>
<%@page import="com.bean.Wishlist"%>
<%@ include file="header.jsp" %>


<%
    int pid=Integer.parseInt(request.getParameter("pid"));
    int uid=u.getUid();
    CartDao.remove_from_cart(uid,pid);
    List<Cart> list=CartDao.getCartByUser(u.getUid());
    int cart_count=list.size();
     session.setAttribute("cart_count", cart_count);   
    response.sendRedirect("cart.jsp");
%>