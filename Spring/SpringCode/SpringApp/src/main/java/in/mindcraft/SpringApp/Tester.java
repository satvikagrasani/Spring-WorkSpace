package in.mindcraft.SpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Laptop l = (Laptop) context.getBean("Lap");
		l.show();
		
		Laptop l1 = (Laptop) context.getBean("L1");
		l1.show();
	}

}
