package Que1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_core.xml");
		
		
//		 Address address= applicationContext.getBean("address",Address.class);
		 
		 Customer customer=applicationContext.getBean("customer",Customer.class);
		 System.out.println(customer);
		 
		 Customer customer1=applicationContext.getBean("customer1",Customer.class);
		 System.out.println(customer1);

	}

}
