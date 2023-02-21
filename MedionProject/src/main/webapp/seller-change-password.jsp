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
                    <span class="breadcrumb-item active">Change Password</span>
                </nav>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->


    <!-- Contact Start -->
    <div class="container-fluid">
        <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">Change Password</span></h2>
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
                    <form  method="post"  action="UserController1">
                       <div class="control-group">
                            <input type="password" class="form-control" name="old_password" id="name" placeholder="Your old password"/>
                            <p class="help-block text-danger"></p>
                        </div>
                        
                     
                       
                       
                        <div class="control-group">
                            <input type="password" class="form-control" name="new_password" id="name" placeholder="Your new password"/>
                            <p class="help-block text-danger"></p>
                        </div>
               
                       <div class="control-group">
                            <input type="password" class="form-control" name="cnew_password" id="name" placeholder="Your confirm new password"/>
                            <p class="help-block text-danger"></p>
                        </div>
                        
                       
                        <div>
                            <button class="btn btn-primary py-2 px-4" type="submit" name="action" value="Change Password">Change Password</button>
                        </div>
                    </form>
                </div>
            </div>
           
        </div>
    </div>
    <!-- Contact End -->


   
</body>

</html>