<%@page import="com.controller.ProductDao1"%>
<%@page import="com.bean.Product1"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    
</head>

<body>
<%@ include file="seller-header.jsp" %>

    <!-- Products Start -->
    <div class="container-fluid pt-5 pb-3">
        <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">My Products</span></h2>
        <div class="row px-xl-5">
        <%
           List<Product1> list=ProductDao1.getProductsBySeller(u.getUid());
           for(Product1 p:list){
        %>
            <div class="col-lg-3 col-md-4 col-sm-6 pb-1">
                <div class="product-item bg-light mb-4">
                    <div class="product-img position-relative overflow-hidden">
                         <img class="img-fluid w-100" src="product_images/<%=p.getProduct_image() %>" alt="" style="height: 300px; width: 300px">
                        <div class="product-action">
                            <a class="btn btn-outline-dark btn-square" href="seller-product-detail.jsp?pid=<%=p.getPid()%>"><i class="fa fa-info-circle" aria-hidden="true"></i></a>
                        </div>
                    </div>
                    <div class="text-center py-4">
                        <a class="h6 text-decoration-none text-truncate" href=""><%=p.getProduct_name() %></a>
                        <div class="d-flex align-items-center justify-content-center mt-2">
                            <h5><%=p.getProduct_price() %></h5><h6 class="text-muted ml-2"></h6>
                        </div>
                    </div>
                </div>
            </div>
             <%} %>
        </div>
    </div>
    <!-- Products End -->




   
</body>

</html>