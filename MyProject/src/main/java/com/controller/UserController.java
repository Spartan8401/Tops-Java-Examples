package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import com.bean.user;
import com.dao.UserDao;


@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("sign up")) {
			
			boolean flag=UserDao.checkEmail(request.getParameter("email"));
			if(flag==true) {
				request.setAttribute("msg", "Email is already Registered");
				request.getRequestDispatcher("signup.jsp").forward(request, response);	
			}
			else {
				if(request.getParameter("password").equals(request.getParameter("cpassword"))) {
		                 	user u=new user();
		                 	u.setUsertype(request.getParameter("usertype"));
		                 	u.setFname(request.getParameter("fname"));
			                u.setLname(request.getParameter("lname"));
			                u.setEmail(request.getParameter("email"));
			    			u.setMobile(request.getParameter("mobile"));                     
			    			u.setAddress(request.getParameter("address"));
			    			u.setPassword(request.getParameter("password"));
			    			UserDao.signup(u);
			    			request.setAttribute("msg", "User Sign Up Sucessfully");
			    			request.getRequestDispatcher("signup.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "Password & Confirm Password Does Not Match");
	    			request.getRequestDispatcher("signup.jsp").forward(request, response);
				}
		}
		}
	
		else if(action.equalsIgnoreCase("login"))
		{
			user u=UserDao.login(request.getParameter("email"));
			if(u==null) {
				request.setAttribute("msg", "Email is Not Registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);	
				
			   }
			else
			  {
				if(u.getPassword().equals(request.getParameter("password"))) {
					 HttpSession session=request.getSession();
					 session.setAttribute("u", u);
					 if(u.getUsertype().equals("buyer")) {
						 request.getRequestDispatcher("index.jsp").forward(request, response);
					 }
					 else {
						 request.getRequestDispatcher("seller-index.jsp").forward(request, response);
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
            user u=(user) session.getAttribute("u");
			if(u.getPassword().equals(request.getParameter("old_password"))) {
				if(!u.getPassword().equals(request.getParameter("new_password"))) {
					if(request.getParameter("new_password").equals(request.getParameter("cnew_password"))) {
						UserDao.changePassword(((user) u).getEmail(), request.getParameter("new_password"));
						request.setAttribute("msg", "Password Change Successfully");
						request.getRequestDispatcher("logout.jsp").forward(request, response);
					}
					else {
						request.setAttribute("msg", "New Password and Confirm password Does Not Match");
						request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
					}
				}
				else {
					request.setAttribute("msg", "New Password could Not Be Same as Old Password");
					request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Old Password Does Not Match");
				request.getRequestDispatcher("seller-change-password.jsp").forward(request, response);
			}
			
		}
	}
}
