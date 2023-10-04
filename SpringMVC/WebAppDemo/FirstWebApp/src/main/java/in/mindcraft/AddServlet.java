package in.mindcraft;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		int c = a+b;
//		response.getWriter().println("Addition: "+c);
//		request.setAttribute("c", c);	
//		RequestDispatcher rd = request.getRequestDispatcher("sq");
//		try {
//			rd.forward(request, response);
//		} catch (Exception e) {
//		}
		
//		//using URL Rewriting
//		response.sendRedirect("sq?c="+c);
		
//		//using HttpSession object
//		HttpSession session= request.getSession();
//		session.setAttribute("c",c);
//		response.sendRedirect("sq");
		
		Cookie cookie = new Cookie("c",c+"");
		response.addCookie(cookie);
		response.sendRedirect("sq");
		
	}
}
