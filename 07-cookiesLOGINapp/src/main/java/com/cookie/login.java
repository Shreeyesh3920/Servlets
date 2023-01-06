package com.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String email=req.getParameter("email");
		String pass=req.getParameter("psw");
		
		Cookie ck1=new Cookie("em", email);
		Cookie ck2=new Cookie("ps", pass);
		resp.addCookie(ck1);
		resp.addCookie(ck2);
		
		resp.sendRedirect("home");
		
	}
   
	
	
}
