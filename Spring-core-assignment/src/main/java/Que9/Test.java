package Que9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("hello.xml");

		
		cap.close();

	}

}
