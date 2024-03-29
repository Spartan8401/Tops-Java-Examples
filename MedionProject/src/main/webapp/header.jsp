	<%@page import="com.bean.user1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html>
	<head>
	 <!-- Basic -->
	  <meta charset="utf-8" />
	  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
	  <!-- Mobile Metas -->
	  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
	  <!-- Site Metas -->
	  <meta name="keywords" content="" />
	  <meta name="description" content="" />
	  <meta name="author" content="" />
	
	  <title>Medion</title>
	
	  <!-- slider stylesheet -->
	  <link rel="stylesheet" type="text/css"
	    href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.1.3/assets/owl.carousel.min.css" />
	
	  <!-- font awesome style -->
	  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	
	  <!-- bootstrap core css -->
	  <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
	
	  <!-- fonts style -->
	  <link href="https://fonts.googleapis.com/css?family=Poppins:400,600,700|Roboto:400,700&display=swap" rel="stylesheet">
	
	  <!-- Custom styles for this template -->
	  <link href="css/style.css" rel="stylesheet" />
	  <!-- responsive style -->
	  <link href="css/responsive.css" rel="stylesheet" />
	
	</head>
	<body>
	 <div class="hero_area">
	    <!-- header section strats -->
	    <header class="header_section">
	      <div class="container-fluid">
	        <nav class="navbar navbar-expand-lg custom_nav-container pt-3">
	          <a class="navbar-brand" href="index.jsp">
	            <img src="images/logo.png" alt="">
	            <span>
	              Medion
	            </span>
	          </a>
	          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
	            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	            <span class="navbar-toggler-icon"></span>
	          </button>
	
                  <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                        <div class="navbar-nav mr-auto py-0">
                            <a href="index.jsp" class="nav-item nav-link active">Home</a>
                            <a href="shop.jsp" class="nav-item nav-link">Shop</a>
                             <div class="nav-item dropdown">
                               <a href="" class="nav-link dropdown-toggle" data-toggle="dropdown" style="color: white;">My Account <i class=""></i></a>
                                <div class="dropdown-menu bg-primary rounded-0 border-0 m-0">
                                <%
                                       user1 u=null;
                                      if(session !=null){
                                    	  if(session.getAttribute("u")!=null){
                                                 u =(user1) session.getAttribute("u");	
                                         %>
                                         <a href="cart.jsp" class="dropdown-item">Shopping Cart(<%= session.getAttribute("cart_count") %>)</a>
                                         <a href="wishlist.jsp" class="dropdown-item">WishList(<%= session.getAttribute("wishlist_count") %>)</a>
                                         <a href="myorder.jsp" class="dropdown-item">My Order</a>
                                         <a href="checkout.jsp" class="dropdown-item">Checkout</a>
                                           <a href="logout.jsp" class="dropdown-item">Logout</a>
                                         
                                         <%         
                                    	  }
                                    	  else{
                                    	  %>
                                    	   <a href="login.jsp" class="dropdown-item">Login</a>
                                           <a href="signup.jsp" class="dropdown-item">Sign Up</a>
                                           <a href="forgot-password.jsp" class="dropdown-item">Forgot Password</a>
                                    	  
                                    	  <% 
                                    	  }  
                                      }
                                      else{
                                    	  %>
                                    	  <a href="login.jsp" class="dropdown-item">Login</a>
                                          <a href="signup.jsp" class="dropdown-item">Sign Up</a>
                                          
                                          <%
                                      }
                                      
                                %>
                                
                                    
                                </div>
                            </div>             <a href="contact.jsp" class="nav-item nav-link">Contact</a>
                        </div>
                     
                    </div>
	
	        </nav>
	      </div>
	    </header>
	    <!-- end header section -->
	
	</body>
	</html>