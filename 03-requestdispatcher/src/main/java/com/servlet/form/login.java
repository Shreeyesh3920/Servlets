package com.servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname=req.getParameter("uname");
		String psw=req.getParameter("psw");
		
		RequestDispatcher rd;
		PrintWriter out=resp.getWriter();
		
		if("shree".equals(uname) && "123".equals(psw))
			{
		//home page			
		//rd=req.getRequestDispatcher("/home");
		//rd.forward(req, resp);		
		resp.sendRedirect("home");
			}
		
		// requestdiapatcher---> methods forward & include
		else 
			{
			//again login page
			rd=req.getRequestDispatcher("/Index.html");
			rd.include(req, resp);
			out.print("INVAILD LOGIN PASSWORD AND NAME");
			
			}
		
	}

	
	
}
