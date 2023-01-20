<%@page import="javax.swing.JPanel"%>
<%@page import="javax.swing.JFrame"%>
<%@page import="java.awt.GridLayout"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  
</head>

<body>
   <%@ include file="header.jsp" %>

    <!-- Breadcrumb Start -->
    <div class="container-fluid">
        <div class="row px-xl-5">
            <div class="col-12">
                <nav class="breadcrumb bg-light mb-30">
                    <a class="breadcrumb-item text-dark" href="#">Home</a>
                    <span class="breadcrumb-item active">Sign Up</span>
                </nav>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->

   
    <!-- Contact Start -->
    <div class="container-fluid">
        <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">Sign Up</span></h2>
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
                    <form method="post"  action="CustomerController">
                    
                     <div class="control-group">
                          <select name="customertype"  class="form-control" id="name">
                             <option>---Select User Type---</option>
                             <option value="buyer">Buyer</option>
                             <option value="artist">Artist</option>
                             
                          </select>
                           <p class="help-block text-danger"></p>
                        </div>
                        
                        <div class="control-group">
                            <input type="text" class="form-control" name="fname" id="name" placeholder="Your First Name" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="text" class="form-control" name="lname" id="name" placeholder="Your Last Name" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="text" class="form-control" name="mobile" id="subject" placeholder="Mobile" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <textarea class="form-control" rows="8" name="address" id="message" placeholder="Address"></textarea>
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="password" class="form-control" name="password" id="name" placeholder="Your password" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="password" class="form-control" name="cpassword" id="name" placeholder="Your confirm password"/>
                            <p class="help-block text-danger"></p>
                        </div>
                        <div>
                            <button class="btn btn-primary py-2 px-4" type="submit" name="action"  value="Sign Up">Sign Up</button>
                        </div>
                    </form>
                </div>
            </div>
           
        </div>
    </div>
    <!-- Contact End -->


    </body>

</html>