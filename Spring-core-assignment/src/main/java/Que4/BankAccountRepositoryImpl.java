package Que4;

import org.springframework.stereotype.Repository;

@Repository
public class BankAccountRepositoryImpl implements BankAccountRepository {
	

	public BankAccountRepositoryImpl() {
		System.out.println("BankAccountRepository Constructor");
	}

	
	
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		return 0;
	}

}
