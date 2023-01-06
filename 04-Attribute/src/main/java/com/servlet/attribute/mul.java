package com.servlet.attribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("mul")
public class mul extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int result=(int) req.getAttribute("result");
		
		// now your addition will be multiplied by the 2 
		//i.e result of servlet 1 is passed to servlet 2 and can be modified!
		
		int final_value=result*2;

		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.print("FINAL OUTPUT="+final_value);
		
	System.out.println(final_value);
	
	}

}
