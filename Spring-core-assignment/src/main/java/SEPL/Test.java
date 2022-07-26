package SEPL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sepl.xml");
		Sample sample = context.getBean("sample",Sample.class);
		
		System.out.println(sample);

	}

}
