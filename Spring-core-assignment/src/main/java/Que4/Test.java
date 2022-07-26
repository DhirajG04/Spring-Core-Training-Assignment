package Que4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		 
	        context.scan("Que4");
	     
	        context.refresh(); 
	       
	        BankAccount component = context.getBean(BankAccount.class);
	       
	        	System.out.println(component.getAccountHolderName()+"\t"+component.getAccountId()+"\t"+component.getAccountBalance()+"\t"+component.getAccountType());
	       
	       
	       BankAccountController controller = context.getBean(BankAccountController.class);
	     
//	       System.out.println(controller.getBalance(5678)); 
//			System.out.println(controller.deposit(5678, 1000));
//			System.out.println(controller.withdraw(5678, 5000));
//			System.out.println(controller.getBalance(5678));
	       
	       BankAccountRepositoryImpl repository = context.getBean(BankAccountRepositoryImpl.class);
	       
	        context.close();

	}

}
