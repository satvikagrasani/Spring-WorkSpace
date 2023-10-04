package in.mindcraft;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;

//import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelServlet extends HttpServlet{
		
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		response.getWriter().println("Welcome "+name);
	}
}
