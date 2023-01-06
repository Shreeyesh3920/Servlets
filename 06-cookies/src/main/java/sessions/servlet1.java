package sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("input1");
		
						//Cookie(key,value);		
		Cookie ck=new Cookie("nm", name);
		resp.addCookie(ck);
		
	
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("WELCOME TO SERVLET1<h1>"+name+"</h1>");
		
		out.print("<a href='servlet2'>click here for servlet 2</a> ");
		
	}
	
}
