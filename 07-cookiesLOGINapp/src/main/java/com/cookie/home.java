package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class home extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] ck=req.getCookies();
		
		
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();		
			out.println("EMAIL="+ck[0].getValue());
			out.println("PASSWORD="+ck[1].getValue());
			
			out.println("<button type='submit'><a href='logout'>Logout</a></button>");
		
		
		
	}

	
	
}
