package sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name=req.getParameter("input1");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		Cookie[] ck=req.getCookies();
		
		out.print("WELCOME TO SERVLET 2<br>"+ck[0].getValue());
		
		
	}
       
}
