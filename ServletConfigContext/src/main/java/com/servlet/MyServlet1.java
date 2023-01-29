package com.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String email,driver;
	ServletConfig config;
    ServletContext context;
	public void init(ServletConfig config) throws ServletException {
        System.out.println("init Called");
		this.config=config;//Servlet level Object
		this.context=config.getServletContext();//Application level Object
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  System.out.println("Service Called");
	  email=config.getInitParameter("email");
	  System.out.println("Email :"+email);
	  driver=context.getInitParameter("driver");
	  System.out.println("Driver :"+driver);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service Called");
	}
  
	
	public void destroy() {
      System.out.println("Destroy called");
    }
}
