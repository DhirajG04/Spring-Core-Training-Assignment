package Que10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImplementationTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext  abstractApplicationContext = new ClassPathXmlApplicationContext("applicationContextAwareInterface.xml");
		
		ApplicationContextAwareTest applicationContextAwareTest= (ApplicationContextAwareTest) abstractApplicationContext.getBean("applicationContextAwareTest");
		
		ApplicationContext applicationContext =applicationContextAwareTest.getContext();
		
		Sample sample=(Sample) applicationContext.getBean("sample");
		
		sample.show();
		
		abstractApplicationContext.registerShutdownHook();

	}

}
