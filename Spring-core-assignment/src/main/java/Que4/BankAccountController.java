package Que4;

import org.springframework.stereotype.Controller;

@Controller
public class BankAccountController {
	
	public BankAccount bankAccount; 
	
	
	public BankAccountController(BankAccount bankAccount) { 
		
		this.bankAccount = bankAccount;
		//System.out.println(bankAccount);

		
	}

	public BankAccountController() { 

		System.out.println("BankAccountController Constructor");
	} 
	
	
	public double withdraw(long accountId, double balance) {


		double total = bankAccount.getAccountBalance()-balance;
		bankAccount.setAccountBalance(total);
		return bankAccount.getAccountBalance();
		
	}
	
	public double deposit(long accountId, double balance) {
		

		double total = bankAccount.getAccountBalance()+balance;
		bankAccount.setAccountBalance(total);
		return bankAccount.getAccountBalance();
	}
	
	public double getBalance(long accountId) {
		
		return bankAccount.getAccountBalance();
		
	}
	
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		
		
		return false;
		
	}


}
