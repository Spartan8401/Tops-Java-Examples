package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.CustomerDao;
import com.bean.Customer;





@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("sign up")) {
	    	  Customer c=new Customer();
	    	  c.setFname(request.getParameter("fname"));
	    	  c.setLname(request.getParameter("lname"));
	    	  c.setEmail(request.getParameter("email"));
	    	  c.setMobile(request.getParameter("mobile"));
	    	  c.setAddress(request.getParameter("address"));
	    	  c.setPassword(request.getParameter("password"));
	    	  CustomerDao.signup(c);
	    	  request.setAttribute("msg", "User Sign Up Sucessfully");
  		   	request.getRequestDispatcher("login.jsp").forward(request, response);
	      }
		else if(action.equalsIgnoreCase("login"))
		{
			Customer c=CustomerDao.login(request.getParameter("email"));
			if(c==null) {
				request.setAttribute("msg", "Email is Not Registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);	
				
			   }
			else
			  {
				if(c.getPassword().equals(request.getParameter("password"))) {
					 HttpSession session=request.getSession();
					 session.setAttribute("c", c);
						 request.getRequestDispatcher("index.jsp").forward(request, response);
					 
				}
			
				else {
					request.setAttribute("msg", "Incorrect Password");
					request.getRequestDispatcher("login.jsp").forward(request, response);	
				}
			  }
		}
	}

}
