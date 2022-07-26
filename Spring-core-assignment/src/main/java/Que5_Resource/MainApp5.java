package Que5_Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp5 {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resource-annotation.xml");
		 
                Company company = applicationContext.getBean("mycompany", Company.class);
                //System.out.println(company.toString());
		
        
                Employee employee = applicationContext.getBean("myemployee", Employee.class);
                System.out.println(employee.toString());
                

	}

}
