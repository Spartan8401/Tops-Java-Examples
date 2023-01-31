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
public class Filter1 extends HttpFilter implements Filter {
   
	public void destroy() {
		System.out.println("destroy filter");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		System.out.println("filter called before response");
		chain.doFilter(request, response);
		System.out.println("filter called before response");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init filter");
	}

}
