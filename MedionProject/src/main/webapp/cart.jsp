<%@page import="com.controller.ProductDao1"%>
<%@page import="com.bean.Product1"%>
<%@page import="com.dao.CartDao1"%>
<%@page import="com.bean.Cart1"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.List"%>
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
                    <a class="breadcrumb-item text-dark" href="#">Shop</a>
                    <span class="breadcrumb-item active">Shopping Cart</span>
                </nav>
            </div>
        </div>
    </div>
    <!-- Breadcrumb End -->


    <!-- Cart Start -->
    <div class="container-fluid">
        <div class="row px-xl-5">
            <div class="col-lg-8 table-responsive mb-5">
                <table class="table table-light table-borderless table-hover text-center mb-0">
                    <thead class="thead-dark">
                        <tr>
                            <th>Products</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Total</th>
                            <th>Remove</th>
                        </tr>
                    </thead>
                    <tbody class="align-middle">
                    <%
                      Random randomGenerator = new Random();
                	  int randomInt = randomGenerator.nextInt(1000000);
                    
                      int net_price=0;
                      List<Cart1> list=CartDao1.getcart1ByUser(u.getUid());
                      for(Cart1 c:list){
                    	  net_price=net_price+c.getTotal_price();
                    	  Product1 p=ProductDao1.getProductsByPid(c.getPid());
                    %>
                        <tr>
                            <td class="align-middle"><img src="product_images/<%=p.getProduct_image() %>" alt="" style="width: 50px;"><%=p.getProduct_name() %></td>
                            <td class="align-middle"><%=p.getProduct_price() %></td>
                            <td class="align-middle">
                                <div class="input-group quantity mx-auto" style="width: 100px;">
                                   <form name="change_qty" method="post" action="CartController1">
                                        <input type="hidden" name="cid" value="<%=c.getCid() %>">
                                    	<input type="number" name="product_qty" min="1" max="10" class="form-control form-control-sm bg-secondary border-0 text-center" value="<%=c.getProduct_qty()%>" onchange="this.form.submit();">
                                   </form>
                                </div>
                            </td>
                            <td class="align-middle"><%=c.getTotal_price() %></td>
                            <td class="align-middle"><a href="remove-from-cart.jsp?pid=<%=p.getPid() %>"><button class="btn btn-sm btn-danger"><i class="fa fa-times"></i></button></a></td>
                        </tr>
                        <%} %>
                   </tbody>
                </table>
            </div>
            <div class="col-lg-4">
              
                <h5 class="section-title position-relative text-uppercase mb-3"><span class="bg-secondary pr-3">Cart Summary</span></h5>
                <div class="bg-light p-30 mb-5">
                    <div class="border-bottom pb-2">
                        <div class="d-flex justify-content-between mb-3">
                            <h6>Subtotal</h6>
                            <h6><%=net_price %></h6>
                        </div>
                        <div class="d-flex justify-content-between">
                            <h6 class="font-weight-medium">Shipping</h6>
                            <h6 class="font-weight-medium">100</h6>
                        </div>
                    </div>
                    <div class="pt-2">
                        <div class="d-flex justify-content-between mt-2">
                            <h5>Total</h5>
                            <h5><%=net_price+100 %></h5>
                        </div>
                         </div>
                            <form method="post" action="pgRedirect.jsp">
					<table border="1">
						<tbody>
							<tr>
								<th>S.No</th>
								<th>Label</th>
								<th>Value</th>
							</tr>
							<tr>
								<td>1</td>
								<td><label>ORDER_ID::*</label></td>
								<td><input id="ORDER_ID" tabindex="1" maxlength="20"
									size="20" name="ORDER_ID" autocomplete="off"
									value="ORDS_<%= randomInt %>"></td>
							</tr>
							<tr>
								<td>2</td>
								<td><label>CUSTID ::*</label></td>
								<td><input id="CUST_ID" tabindex="2" maxlength="30"
									size="12" name="CUST_ID" autocomplete="off" value="<%=u.getUid()%>_<%=u.getFname()%>"></td>
							</tr>
							<tr>
								<td>3</td>
								<td><label>INDUSTRY_TYPE_ID ::*</label></td>
								<td><input id="INDUSTRY_TYPE_ID" tabindex="4"
									maxlength="12" size="12" name="INDUSTRY_TYPE_ID"
									autocomplete="off" value="Retail"></td>
							</tr>
							<tr>
								<td>4</td>
								<td><label>Channel ::*</label></td>
								<td><input id="CHANNEL_ID" tabindex="4" maxlength="12"
									size="12" name="CHANNEL_ID" autocomplete="off" value="WEB">
								</td>
							</tr>
							<tr>
								<td>5</td>
								<td><label>txnAmount*</label></td>
								<td><input title="TXN_AMOUNT" tabindex="10" type="text"
									name="TXN_AMOUNT" value="<%=net_price+100%>"></td>
							</tr>
							<tr>
								<td colspan="3">
									<button value="CheckOut" type="submit" class="btn btn-block btn-primary font-weight-bold my-3 py-3">Proceed To Checkout</button>
								</td>
								</tr>
						</tbody>
					</table>
					* - Mandatory Fields
				</form>
                   
                </div>
            </div>
        </div>
    </div>
    <!-- Cart End -->


    

   
</body>

</html>