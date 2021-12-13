/*
 * 4. 
 * Счета. Клиент может иметь несколько счетов в банке. 
 * - Учитывать возможность блокировки/разблокировки счета. 
 * - Реализовать поиск и сортировку счетов. 
 * - Вычисление общей суммы по счетам. 
 * - Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно. 
 */
package by.epam.classes.aggregation_and_composition.task4;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
              
        Customer customer = Customer.setCustomer(scanner);
        
        int choice;
        
        while (true) {
            menuText();
            choice = Customer.numInput();
            if (choice == 0)
                break;
            if (choice < 0 || choice > 9) {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice) {
                case 1:
                    System.out.print("Sum = ");
                    customer.createBankAccount(Customer.numInput());
                    break; 
                case 2:
                    System.out.println("Individual bank accounts:");
                    customer.bankAccountInfo();
                    break;
                case 3:
                    System.out.print("Account id: ");
                    customer.toBlockAccount(Customer.numInput());
                    break; 
                case 4:
                    System.out.print("Account id: ");
                    customer.toUnblockAccount(Customer.numInput());
                    break;   
                case 5:
                    System.out.print("Account id: ");
                    customer.accountInfo(Customer.numInput());
                    break;    
                case 6:
                    System.out.println("Accounts by sum: ");
                    customer.sortBankAccount();
                    break; 
                case 7:
                    System.out.println("Total sum all accounts: " + customer.totalSum());
                    break;   
                case 8:
                    System.out.println("Sum of positive accounts: " + customer.positiveSum());
                    break;    
                case 9:
                    System.out.println("Sum of negative accounts: " + customer.negativeSum());
                    break;  
            }     
            
        }
        
    }
    
    private static void menuText() { 
        System.out.print(
            "\n" + 
            "0 - Exit\n" +
            "1 - Add account\n" +     
            "2 - Bank accounts of an individual\n" +    
            "3 - Block account by id\n" +      
            "4 - Unblock account by id\n" +      
            "5 - Information about the account by id\n" +     
            "6 - Sort accounts by amount\n" +  
            "7 - Total amount of accounts\n" +    
            "8 - Sum of accounts with positive balance\n" +                     
            "9 - Sum of accounts with negative balance\n" +                     
            "\n"
        );   
    }
    
}
