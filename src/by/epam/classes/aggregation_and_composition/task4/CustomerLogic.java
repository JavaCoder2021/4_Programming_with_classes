package by.epam.classes.aggregation_and_composition.task4;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerLogic {
	
	private boolean success;
	private int sum;
	
	public BankAccount findAccount(Customer customer, int id) {	
		for (BankAccount bankAccount : customer.getAccounts())
			if (bankAccount.getId() == id)
				return bankAccount;	
		return null;
	}
	
	public boolean removeAccount(Customer customer, int id) {	
		success = false;
		for (BankAccount bankAccount : customer.getAccounts())
			if (bankAccount.getId() == id) {
				customer.getAccounts().remove(bankAccount);
				success = true;
			}
		return success;		
	}
	
	public boolean blockedAccount(Customer customer, int id) {
		success = false;
		for (BankAccount bankAccount : customer.getAccounts())
			if (bankAccount.getId() == id) {
				bankAccount.blocked();
				success = true;
			}
		return success;
	}
	
	public boolean unBlockedAccount(Customer customer, int id) {
		boolean success = false;
		for (BankAccount bankAccount : customer.getAccounts())
			if (bankAccount.getId() == id) {
				bankAccount.unBlocked();
				success = true;
			}
		return success;
	}
	
    	public void sortBySum(List<BankAccount> accounts) {
        	Collections.sort(accounts, new Comparator<BankAccount>() {
            		@Override
            		public int compare(BankAccount left, BankAccount right) {
                		return left.getSum() - right.getSum();
            		}
        	});
    	}
    
	public int getTotalSum (Customer customer) {
		sum = 0;
		for (BankAccount bankAccount : customer.getAccounts())
			sum += bankAccount.getSum();
		return sum;
	}
	
	public int getPositiveSum (Customer customer) {
		sum = 0;
		for (BankAccount bankAccount : customer.getAccounts())
			if (bankAccount.getSum() > 0)
				sum += bankAccount.getSum();
		return sum;
	}
	
	public int getNegativeSum (Customer customer) {
		sum = 0;
		for (BankAccount bankAccount : customer.getAccounts())
			if (bankAccount.getSum() < 0)
				sum += bankAccount.getSum();
		return sum;
	}

}
