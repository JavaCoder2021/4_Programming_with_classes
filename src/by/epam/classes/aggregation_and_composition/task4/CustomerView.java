package by.epam.classes.aggregation_and_composition.task4;

public class CustomerView {
	
	public void printBankAccounts(Customer customer) {
		
		for (BankAccount bankAccount : customer.getAccounts())
			System.out.println(bankAccount);
		
	}
	
	public void printBankAccount(BankAccount bankAccount) {
		
			System.out.println(bankAccount);
		
	}

}