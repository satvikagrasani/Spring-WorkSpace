package in.mindcraft;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
//		//using URL Rewriting
//		int c = (int)request.getAttribute("c");
//		//using URL Rewriting
//		int c = Integer.parseInt(request.getParameter("c"));
		
//		//using HttpSession object
//		HttpSession session = request.getSession();
//		int c = (int)session.getAttribute("c");
		
		//using cookies
		int c = 0;
		Cookie [] cookies = request.getCookies();
		for(Cookie ck:cookies) {
			if(ck.getName().equals("c"))
			{
				c= Integer.parseInt(ck.getValue());
			}
		}
		
		
		int sq = c*c;
		HttpSession session = request.getSession();
		session.setAttribute("sq",sq);
		response.sendRedirect("result.jsp");
		
	}
	

}
