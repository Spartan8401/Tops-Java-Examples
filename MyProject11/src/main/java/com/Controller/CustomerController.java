package com.Controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.CustomerDao;
import com.bean.customer;
import com.services.Services;





@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("sign up")) {
	    	  customer c=new customer();
	    	  c.setCustomertype(request.getParameter("customertype"));
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
			customer c=CustomerDao.login(request.getParameter("email"));
			if(c==null) {
				request.setAttribute("msg", "Email is Not Registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);	
				
			   }
			else
			  {
				if(c.getPassword().equals(request.getParameter("password"))) {
					 HttpSession session=request.getSession();
					 session.setAttribute("c", c);
					 if(c.getCustomertype().equals("buyer")) {
						 request.getRequestDispatcher("index.jsp").forward(request, response);
					 }
					 else {
						 request.getRequestDispatcher("artist-index.jsp").forward(request, response);
					 }
					 
				}
			
				else {
					request.setAttribute("msg", "Incorrect Password");
					request.getRequestDispatcher("login.jsp").forward(request, response);	
				}					 
			  }
			
				
			  
		}
		else if(action.equalsIgnoreCase("change password"))
		{  
			HttpSession session=request.getSession();
            customer c=(customer) session.getAttribute("c");
			if(c.getPassword().equals(request.getParameter("old_password"))) {
				if(!c.getPassword().equals(request.getParameter("new_password"))) {
					if(request.getParameter("new_password").equals(request.getParameter("cnew_password"))) {
						CustomerDao.changePassword(((customer) c).getEmail(), request.getParameter("new_password"));
						request.setAttribute("msg", "Password Change Successfully");
						request.getRequestDispatcher("logout.jsp").forward(request, response);
					}
					else {
						request.setAttribute("msg", "New Password and Confirm password Does Not Match");
						request.getRequestDispatcher("artist-change-password.jsp").forward(request, response);
					}
				}
				else {
					request.setAttribute("msg", "New Password could Not Be Same as Old Password");
					request.getRequestDispatcher("artist-change-password.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Old Password Does Not Match");
				request.getRequestDispatcher("artist-change-password.jsp").forward(request, response);
			}
			
		}
		else if(action.equalsIgnoreCase("send otp"))
		{
			boolean flag=CustomerDao.checkEmail(request.getParameter("email"));
			if(flag==true)
			{
				Random t = new Random();
		    	int minRange = 1000, maxRange= 9999;
	        	int otp = t.nextInt(maxRange - minRange) + minRange;
	        	Services.sendMail(request.getParameter("email"), otp);
	        	request.setAttribute("email", request.getParameter("email"));
	        	request.setAttribute("otp", otp);
	        	request.getRequestDispatcher("otp.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "Email Not Registered");
				request.getRequestDispatcher("forgot-password.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("verify otp")) {
			String email=request.getParameter("email");
			int otp=Integer.parseInt(request.getParameter("otp"));
			int uotp=Integer.parseInt(request.getParameter("uotp"));
		   
			 if(otp==uotp) {
				 request.setAttribute("email", email);
				 request.getRequestDispatcher("new-password.jsp").forward(request, response);
			 }
			 else {
				 request.setAttribute("msg", "Invalid OTP");
				 request.setAttribute("otp", otp);
				 request.setAttribute("email", email);
				 request.getRequestDispatcher("otp.jsp").forward(request, response);
				 
			 }

		}
		else if(action.equalsIgnoreCase("update password")){
			String email=request.getParameter("email");
			String new_password=request.getParameter("new_password");
			String cnew_password=request.getParameter("cnew_password");
			
			if(new_password.equals(cnew_password)) {
			 CustomerDao.changePassword(email, cnew_password);
				request.setAttribute("msg", "Password Update Successfuly");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "New Password & Confirm Password Does Not Match");
				request.setAttribute("email", email);
				request.getRequestDispatcher("new-password.jsp").forward(request, response);
			}
		}
	}

}
