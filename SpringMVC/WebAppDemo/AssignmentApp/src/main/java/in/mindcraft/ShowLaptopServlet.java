package in.mindcraft;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


@WebServlet("/show")
public class ShowLaptopServlet extends HttpServlet{
	private Collection<AddLaptopServlet> dlist = new ArrayList<AddLaptopServlet>();
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session =sf.openSession();
				
		Query dquery = session.createQuery("from AddLaptopServlet");
		@SuppressWarnings("unchecked") 
		Collection<AddLaptopServlet> dlist = dquery.list();
		
		HttpSession session1= request.getSession();
		session1.setAttribute("List",dlist);
		response.sendRedirect("show.jsp");
		
	}
}
