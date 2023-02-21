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
                    <span class="breadcrumb-item active">Edit Product</span>
                </nav>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->


    <!-- Contact Start -->
    <div class="container-fluid">
        <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">Edit Product</span></h2>
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
                    <%
                    int pid=Integer.parseInt(request.getParameter("pid"));
                    Product1 p=ProductDao1.getProductsByPid(pid);
                    %>
                    <form method="post"  action="ProductController1" enctype="multipart/form-data">
                    <input type="hidden" name="seller" value="<%=u.getUid() %>">
                     <input type="hidden" name="pid" value="<%=p.getPid() %>">
                     <div class="control-group">
                          <select name="product_category"  class="form-control" id="name">
                          <%
                            if(p.getProduct_category().equals("child")){
                            	%>
                            	 <option>---Select Product Category---</option>
	                             <option value="child">Child</option>
	                             <option value="adult">Adult</option>
	                             <option value="senior">Senior</option>
	                            	
                            	
                            	<%
                            	
                            }
                            else if(p.getProduct_category().equals("adult")){
                            	%>
                            	 <option>---Select Product Category---</option>
	                             <option value="child">Child</option>
	                             <option value="adult">Adult</option>
	                             <option value="senior">Senior</option>	                            	
                            	
                            	<%
                            }
                            else if(p.getProduct_category().equals("senior")){
                            	%>
                            	 <option>---Select Product Category---</option>
	                             <option value="child">Child</option>
	                             <option value="adult">Adult</option>
	                             <option value="senior">Senior</option>
	                            	
                            	
                            	<%
                            }
                            else{
                            	%>
                            	 <option>---Select Product Category---</option>
	                             <option value="child">Child</option>
	                             <option value="adult">Adult</option>
	                             <option value="senior">Senior</option>
	                            	
                            	
                            	<%
                            }
                          
                          %>
                          
                          </select>
                           <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="text" class="form-control" name="product_name" id="name" value="<%=p.getProduct_name() %>" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="text" class="form-control" name="product_price" id="name" value="<%=p.getProduct_price()%>" />
                            <p class="help-block text-danger"></p>
                        </div>
                        
                        <div class="control-group">
                            <textarea class="form-control" rows="8" name="product_desc" id="message"><%=p.getProduct_desc()%></textarea>
                            <p class="help-block text-danger"></p>
                        </div>
                        
                        <div class="control-group">
                            <img alt="" src="product_images/<%=p.getProduct_image()%>">
                            </div>
                          <div class="control-group">
                            <input type="hidden" class="form-control" name="product_image1" value="<%=p.getProduct_image()%>"/>
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="file" class="form-control" name="product_image"/>
                            <p class="help-block text-danger"></p>
                        </div>
                        <div>
                            <button class="btn btn-primary py-2 px-4" type="submit" name="action"  value="update Product">Update Product</button>
                        </div>
                    </form>
                </div>
            </div>
           
        </div>
    </div>
    <!-- Contact End -->


   
</body>

</html>