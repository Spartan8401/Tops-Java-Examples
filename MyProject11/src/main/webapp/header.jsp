<%@page import="com.bean.customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Dgocky – DJ Party & Night Club  </title>
    <!-- favicon -->
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <!-- bootstrap -->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <!-- fontawesome icon  -->
    <link rel="stylesheet" href="assets/css/fontawesome.min.css">
    <!-- flaticon css -->
    <link rel="stylesheet" href="assets/fonts/flaticon.css">
    <!-- animate.css -->
    <link rel="stylesheet" href="assets/css/animate.css">
    <!-- Owl Carousel -->
    <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
    <!-- magnific popup -->
    <link rel="stylesheet" href="assets/css/magnific-popup.css">
    <!-- stylesheet -->
    <link rel="stylesheet" href="assets/css/style.css">
    <!-- responsive -->
    <link rel="stylesheet" href="assets/css/responsive.css">
</head>

    <body>

        <!-- preloader begin -->
        <div class="preloader">
            <div class="loader">
                <hr>
                <hr>
            </div>
        </div>
        <!-- preloader end -->

        <!-- header begin -->
        <div class="header">
            <div class="container">
                <div class="row">
                    <div class="col-xl-4 col-lg-4 d-xl-flex d-lg-flex align-items-center">
                        <div class="row">
                            <div class="col-xl-12 col-lg-12 col-6 d-xl-block d-lg-block d-flex align-items-center">
                                <div class="logo">
                                    <a href="index-2.jsp"><img src="assets/img/logo.png" alt=""></a>
                                </div>
                            </div>
                            <div class="d-xl-none d-lg-none d-block col-6">
                                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                    <i class="fas fa-bars"></i>
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-8 col-lg-8">
                        <div class="mainmenu">
                            <nav class="navbar navbar-expand-lg">
                                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                    <ul class="navbar-nav mr-auto">
                                        <li class="nav-item">
                                            <a class="nav-link active" href="about.jsp">About</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-item nav-link" href="event.jsp"> Event</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-item nav-link" href="gallery.jsp"> Gallery</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-item nav-link" href="top-dj.jsp">Top DJ</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-item nav-link" href="schedule.jsp">Schedule</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-item nav-link" href="blog.jsp">Blog</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-item nav-link" href="faq.jsp">Faq</a>
                                        </li>
                                <li>
                                 <div class="nav-item dropdown">
                                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">My Account <i class="fa fa-angle-down mt-1"></i></a>
                                <div class="dropdown-menu bg-primary rounded-0 border-0 m-0">
                                    <%
                                      customer c=null;
                                      if(session !=null){
                                    	  if(session.getAttribute("c")!=null){
                                                 c =(customer) session.getAttribute("c");	
                                         %>
                                        
                                           <a href="logout.jsp" class="dropdown-item">Logout</a>
                                         
                                         <%         
                                    	  }
                                    	  else{
                                    	  %>
                                    	   <a href="login.jsp" class="dropdown-item">Login</a>
                                           <a href="signup.jsp" class="dropdown-item">Sign Up</a>
                                    	  
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
                            </div>
                            </li>
                           
                                        <li class="nav-item">
                                            <a class="nav-item nav-link" href="contact.jsp"> Contact</a>
                                            
                                        </li>
                                    
                                    </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- header end -->
      
    
               
              <!-- jquery -->
        <script src="assets/js/jquery.js"></script>
        <!-- bootstrap -->
        <script src="assets/js/bootstrap.min.js"></script>
        <!-- owl carousel -->
        <script src="assets/js/owl.carousel.js"></script>
        <!-- magnific popup -->
        <script src="assets/js/jquery.magnific-popup.js"></script>
        <!-- way poin js-->
        <script src="assets/js/waypoints.min.js"></script>
        <!-- wow js-->
        <script src="assets/js/wow.min.js"></script>
        <!-- main -->
        <script src="assets/js/main.js"></script>
      
    </body>

</html>