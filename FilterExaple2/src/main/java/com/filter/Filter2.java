package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/Filter1")
public class Filter2 extends HttpFilter implements Filter {
   
	public void destroy() {
		System.out.println("destroy filter");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
        String username=request.getParameter("uname");
        String password=request.getParameter("password"); 
		
        if(username.equalsIgnoreCase("Piyush") && password.equalsIgnoreCase("Panchal")) {
        	chain.doFilter(request, response);
        }
        else {
            request.setAttribute("msg", "UserName Or Password Is Incorrect");
            request.getRequestDispatcher("index1.jsp").forward(request, response);
        }
 
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init filter");
	}

}
