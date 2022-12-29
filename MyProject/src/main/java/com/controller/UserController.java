package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
