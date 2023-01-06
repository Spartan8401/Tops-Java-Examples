<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  
</head>

<body>
 <%@ include file="artist-header.jsp" %>

    <!-- Breadcrumb Start -->
    <div class="container-fluid">
        <div class="row px-xl-5">
            <div class="col-12">
                <nav class="breadcrumb bg-light mb-30">
                    <a class="breadcrumb-item text-dark" href="#">Home</a>
                    <span class="breadcrumb-item active">New Password</span>
                </nav>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->


    <!-- Contact Start -->
    <div class="container-fluid">
        <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">New Password</span></h2>
        <div class="row px-xl-5">
            <div class="col-lg-12 mb-12">
                <div class="contact-form bg-light p-30">
                <b style="color: red;">
                    <%
                        if(request.getAttribute("msg")!=null){
                        	out.print(request.getAttribute("msg"));
                        }
                    %>
                    </b>
                    <form  method="post"  action="CustomerController">
                                        
                        <input  type="hidden" name="email" value="<%=request.getAttribute("email") %>">                   
                        <div class="control-group">
                            <input type="password" class="form-control" name="new_password" id="name" placeholder="Your new password"/>
                            <p class="help-block text-danger"></p>
                        </div>
               
                       <div class="control-group">
                            <input type="password" class="form-control" name="cnew_password" id="name" placeholder="Your confirm new password"/>
                            <p class="help-block text-danger"></p>
                        </div>
                        
                       
                        <div>
                            <button class="btn btn-primary py-2 px-4" type="submit" name="action" value="Update Password">Update Password</button>
                        </div>
                    </form>
                </div>
            </div>
           
        </div>
    </div>
    <!-- Contact End -->


  <%@ include file="footer.jsp" %>
    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>

    <!-- Contact Javascript File -->
    <script src="mail/jqBootstrapValidation.min.js"></script>
    <script src="mail/contact.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
</body>

</html>