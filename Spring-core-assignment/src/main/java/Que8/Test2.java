package Que8;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) throws Exception {

		ConfigurableApplicationContext   context = new ClassPathXmlApplicationContext("q8-bean2.xml");

        context.close();
	}

}
