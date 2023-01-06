package com.servlet.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class register extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		String email=req.getParameter("email");
		String psw=req.getParameter("psw");
		String cpsw=req.getParameter("psw-repeat");
		
		//print
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("WELCOME TO SERVLET<h1><b>"+email+"</b></h1>");
		
		
		
		//print console
		System.out.println("EMAIL="+email+"  password="+psw+"  confirm-password="+cpsw);
	
	}

	
	


}
