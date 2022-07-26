package Que3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("que3_bank.xml");

		BankAccount bankAccount = (BankAccount) applicationContext.getBean("bankAccount");	

		
		BankAccountController bankAccountController = applicationContext.getBean("bankAccountController", BankAccountController.class);

		
		System.out.println(bankAccountController.getBalance(1234)); 
		System.out.println(bankAccountController.deposit(1234, 1000));
		System.out.println(bankAccountController.withdraw(1234, 5000));
		System.out.println(bankAccountController.getBalance(1234));

	}

}
