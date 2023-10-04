package in.mindcraft;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;

@WebServlet("/add")
@Entity
public class AddLaptopServlet extends HttpServlet{
	@Id
	private int mid;
	private String make;
	private double cost;
	
	public AddLaptopServlet() {
		
	}
	
	public AddLaptopServlet(int mid, String make, double cost) {
		super();
		this.mid = mid;
		this.make = make;
		this.cost = cost;
	}
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Laptop [mid=" + mid + ", make=" + make + ", cost=" + cost + "]";
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session =sf.openSession();
		
		//Input form user index.html
		int Id = Integer.parseInt(request.getParameter("ID"));
		String Make = request.getParameter("Make");
		int Cost = Integer.parseInt(request.getParameter("Cost"));
		
		Transaction l1 = session.beginTransaction();
		AddLaptopServlet L = new AddLaptopServlet();
		
		L.setMid(Id);
		L.setMake(Make);
		L.setCost(Cost);
		
		session.save(L);
		l1.commit();
		
		HttpSession session1= request.getSession();
		session1.setAttribute("Id",Id);
		session1.setAttribute("Make",Make );
		session1.setAttribute("Cost", Cost);
		response.sendRedirect("insert.jsp");
	}
}