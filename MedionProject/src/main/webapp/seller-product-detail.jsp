<%@page import="com.controller.ProductDao1"%>
<%@page import="com.bean.Product1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
   
</head>

<body>
  <%@ include file="seller-header.jsp" %>


    <!-- Breadcrumb Start -->
    <div class="container-fluid">
        <div class="row px-xl-5">
            <div class="col-12">
                <nav class="breadcrumb bg-light mb-30">
                    <a class="breadcrumb-item text-dark" href="#">Home</a>
                    <a class="breadcrumb-item text-dark" href="#">Seller</a>
                    <span class="breadcrumb-item active">Product Detail</span>
                </nav>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->

<%
   int pid=Integer.parseInt(request.getParameter("pid"));
   Product1 p=ProductDao1.getProductsByPid(pid);
%>
    <!-- Shop Detail Start -->
    <div class="container-fluid pb-5">
        <div class="row px-xl-5">
            <div class="col-lg-5 mb-30">
                <div id="product-carousel" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner bg-light">
                        <div class="carousel-item active">
                            <img class="w-100 h-100" src="product_images/<%=p.getProduct_image() %>" alt="Image">
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-lg-7 h-auto mb-30">
                <div class="h-100 bg-light p-30">
                    <h3>Product Name:<%=p.getProduct_name() %></h3>
                    <h3>Product Category : <%=p.getProduct_category() %></h3>
                    <h3 class="font-weight-semi-bold mb-4">Product Price : <%=p.getProduct_price() %></h3>
                    <p class="mb-4">Product Detail : <%=p.getProduct_desc() %></p>
                    <div class="d-flex align-items-center mb-4 pt-2">
                       
                        <a href="seller-edit-product.jsp?pid=<%=p.getPid()%>"><button class="btn btn-info px-3">Edit</button></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         <a href="seller-delete-product.jsp?pid=<%=p.getPid()%>"><button class="btn btn-danger px-3">Delete</button></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Products End -->


    
</body>

</html>