/*
 * 4. 
 * Счета. Клиент может иметь несколько счетов в банке. 
 * - Учитывать возможность блокировки/разблокировки счета. 
 * - Реализовать поиск и сортировку счетов. 
 * - Вычисление общей суммы по счетам. 
 * - Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */
package by.epam.classes.aggregation_and_composition.task4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    	BankAccount bankAccount;
		CustomerLogic customerLogic = new CustomerLogic();
		CustomerView customerView = new CustomerView();
		
		Customer customer = new Customer("Ivanov", "Ivan", "Ivanovich", "Vitebsk", "BM0000001");
		customer.addAccount(new BankAccount(false, 5000));
		customer.addAccount(new BankAccount(true,  -2500));
		customer.addAccount(new BankAccount(false, -500));
		customer.addAccount(new BankAccount(false, 4000));
		
        int choice;
        
        while (true) {
        	
            menuText();
            choice = getIntFromConsol("");

            if (choice < 0 || choice > 8) {
                System.out.println("Incorrect choose!");
                continue;
            }
                 
            if (choice == 0)
                break;
            switch (choice) {
                case 1:
                	customerView.printBankAccounts(customer);
                    break;
                case 2:
                	if (customerLogic.blockedAccount(customer, getIntFromConsol("Id: ")))
                		System.out.println("Account blocked!");
                	else
                		System.out.println("Incorrect Id!");
                    break; 
                case 3:
                	if (customerLogic.unBlockedAccount(customer, getIntFromConsol("Id: ")))
                		System.out.println("Account unblocked!");
                	else
                		System.out.println("Incorrect Id!");
                    break;   
                case 4:
                	bankAccount = customerLogic.findAccount(customer, getIntFromConsol("Id: "));
                	if (bankAccount != null)
                		customerView.printBankAccount(bankAccount);
                	else
                		System.out.println("Incorrect Id!");                		
                    break;    
                case 5:
                	customerLogic.sortBySum(customer.getAccounts());
                	customerView.printBankAccounts(customer);
                    break; 
                case 6:
                    System.out.println("Total sum all accounts: " + customerLogic.getTotalSum(customer));
                    break;   
                case 7:
                    System.out.println("Sum of positive accounts: " + customerLogic.getPositiveSum(customer));
                    break;    
                case 8:
                    System.out.println("Sum of negative accounts: " + customerLogic.getNegativeSum(customer));
                    break;  
            }    
            
        }
        
    }
    
    public static void menuText() { 
        System.out.print(
                "\n" + 
                "0 - Exit\n" +   
                "1 - Bank accounts of an individual\n" +    
                "2 - Block account by id\n" +      
                "3 - Unblock account by id\n" +      
                "4 - Information about the account by id\n" +     
                "5 - Sort accounts by sum\n" +  
                "6 - Total sum of accounts\n" +    
                "7 - Sum of accounts with positive balance\n" +                     
                "8 - Sum of accounts with negative balance\n" +                     
                "\n"
            );   
    }
    
	public static int getIntFromConsol(String str) {

		int a;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print(str);
		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.print(str);
		}
		a = scanner.nextInt();

		return a;

	}
    
}
