package Que4;

import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService {
	
	

	public BankAccountServiceImpl() {
		System.out.println("BankAccountService Constructor");
	}

	
	
	public double withdraw(long accountId, double balance) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double deposit(long accountId, double balance) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return getBalance(0);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
