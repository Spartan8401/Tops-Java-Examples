<%@page import="com.dao.CartDao1"%>
<%@page import="com.bean.Cart1"%>
<%@page import="com.controller.ProductDao1"%>
<%@page import="com.bean.Product1"%>
<%@page import="java.util.List"%>
<%@ include file="header.jsp" %>


<%
    int pid=Integer.parseInt(request.getParameter("pid"));
    int uid=u.getUid();
    int product_qty=1;
    Product1 p=ProductDao1.getProductsByPid(pid);
    int product_price=p.getProduct_price();
    int total_price=p.getProduct_price();
    String payment_status="pending";
    Cart1 c=new Cart1();
    c.setUid(uid);
    c.setPid(pid);
    c.setProduct_price(product_price);
    c.setProduct_qty(product_qty);
    c.setTotal_price(total_price);
    c.setPayment_status(payment_status);
    CartDao1.addTocart1(c);
    List<Cart1> list=CartDao1.getcart1ByUser(u.getUid());
    int cart_count=list.size();
     session.setAttribute("cart_count", cart_count);  
    response.sendRedirect("cart.jsp");
%>