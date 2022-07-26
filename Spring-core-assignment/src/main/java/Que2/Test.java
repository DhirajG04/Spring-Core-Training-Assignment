package Que2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("answer.xml");
		
		
		Question question= applicationContext.getBean("question",Question.class);
		question.displayAnswerInList();
		
		Question question1= applicationContext.getBean("question1",Question.class);
		question1.displayAnswerInSet();
		
		Question question2= applicationContext.getBean("question2",Question.class);
		question2.displayAnswerInMap();

	}

}
