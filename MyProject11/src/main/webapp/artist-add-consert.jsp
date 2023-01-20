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
                    <span class="breadcrumb-item active">Add Consert</span>
                </nav>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->


    <!-- Contact Start -->
    <div class="container-fluid">
        <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">Add Consert</span></h2>
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
                    <form method="post"  action="artistController" enctype="multipart/form-data">
                    <input type="hidden" name="artist" value="<%=c.getCid() %>">
                     <div class="control-group">
                          <select name="artist_catogory"  class="form-control" id="name">
                             <option>---Select Artist Category---</option>
                             <option value="men">Men</option>
                             <option value="women">Women</option>
                             
                          </select>
                           <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="text" class="form-control" name="artist_name" id="name" placeholder="Your Artist Name" />
                            <p class="help-block text-danger"></p>
                        </div>
                        <div class="control-group">
                            <input type="text" class="form-control" name="ticket_price" id="name" placeholder="Your Ticket Price" />
                            <p class="help-block text-danger"></p>
                        </div>
                        
                        <div class="control-group">
                            <textarea class="form-control" rows="8" name="artist_desc" id="message" placeholder="Description"></textarea>
                            <p class="help-block text-danger"></p>
                        </div>
                        
                        <div class="control-group">
                            <input type="file" class="form-control" name="artist_image"/>
                            <p class="help-block text-danger"></p>
                        </div>
                        <div>
                            <button class="btn btn-primary py-2 px-4" type="submit" name="action"  value="Add Consert">Add Consert</button>
                        </div>
                    </form>
                </div>
            </div>
           
        </div>
    </div>
    <!-- Contact End -->
<%@ include file="footer.jsp" %>

</body>

</html>