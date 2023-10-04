package in.mindcraft.AnnotationsConfigDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new  ClassPathXmlApplicationContext("spring.xml");
		MobilePhone m1 = (MobilePhone)context.getBean("mobilePhone");
		m1.show();
		MobilePhone m2 = (MobilePhone)context.getBean("mobilePhone");
		m2.show();
	}

}
