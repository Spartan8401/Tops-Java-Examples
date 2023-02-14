package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.EmployeeInfo;
import com.bean.Employees;
import com.bean.EmployeeInfo;
import com.dao.EmployeeDao;


public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert"))
		{
			EmployeeInfo einfo=new EmployeeInfo();
			einfo.setFname(request.getParameter("fname"));
			einfo.setLname(request.getParameter("lname"));
			einfo.setMobile(request.getParameter("mobile"));
			einfo.setAddress(request.getParameter("address"));
			
			EmployeeDao.insertEmployeeinfo(einfo);
			
			Employees e=new Employees();
			e.setUname(request.getParameter("uname"));
			e.setPassword(request.getParameter("password"));
			e.setEpid(einfo);
			
			EmployeeDao.insertEmployees(e);                 
			response.sendRedirect("insert.jsp");
		}
		else if(action.equalsIgnoreCase("edit")) {
			int epid=Integer.parseInt(request.getParameter("epid"));
			EmployeeInfo s=(EmployeeInfo) EmployeeDao.getAllEmployees(epid);
			request.setAttribute("s", s);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update")) {
			EmployeeInfo s=new EmployeeInfo();
			s.setEpid(Integer.parseInt(request.getParameter("epid")));
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setAddress(request.getParameter("address"));
			s.setMobile(request.getParameter("mobile"));
			EmployeeDao.insertEmployeeinfo(s);
			response.sendRedirect("Show.jsp");
		}
		else if(action.equalsIgnoreCase("update")) {
			Employees s=new Employees();
			s.setEid(Integer.parseInt(request.getParameter("eid")));
			s.setUname(request.getParameter("uname"));
			s.setPassword(request.getParameter("password"));
			EmployeeDao.insertEmployees(s);
			response.sendRedirect("Show.jsp");
		}
	}

}
