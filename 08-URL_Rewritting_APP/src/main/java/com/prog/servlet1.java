package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("psw");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();		

		out.print("HIII USER NAMED= "+email+"<br>");
		out.print("<a href='servlet2?email="+email+"'>go to servlet 2</a>");

	}

	
	
}
