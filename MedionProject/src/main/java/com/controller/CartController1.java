package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Cart1;
import com.dao.CartDao1;


@WebServlet("/CartController1")
public class CartController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int cid=Integer.parseInt(request.getParameter("cid"));
	     int product_qty=Integer.parseInt(request.getParameter("product_qty")); 
	     Cart1 c=CartDao1.getcart1ByCid(cid);
	     int product_price=c.getProduct_price();
	     int total_price=product_price*product_qty;
	     CartDao1.updatecart1(cid, product_qty, total_price);
	     response.sendRedirect("cart.jsp");
	}

}
