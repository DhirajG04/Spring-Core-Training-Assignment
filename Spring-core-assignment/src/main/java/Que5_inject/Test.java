package Que5_inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(("inject.xml"));

		Employee employee = (Employee)applicationContext.getBean("employee");

		  
		   System.out.println("The Employee Name : " + employee.getName());
		   System.out.println("The Employee Age : " + employee.getAge());
		   System.out.println("The Employee Address : " +   
		     employee.getAddress().getStreet() + " " +
		     employee.getAddress().getCity() + " " +
		     employee.getAddress().getState());
		  
	}
	

}
