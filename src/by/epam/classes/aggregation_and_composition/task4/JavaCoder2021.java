package javacoder2021;

import by.epam.classes.aggregation_and_composition.*;
import java.util.*;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
              
        Customer customer = Customer.setCustomer(scanner);
        
        int choice;
        
        while (true)
        {
            menuText();
            choice = scanner.nextInt();
            if (choice == 0)
                break;
            if (choice < 0 || choice > 9)
            {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice)
            {
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
            "0 - Выход\n" +
            "1 - Добавить счёт\n" +     
            "2 - Банковские счета физического лица\n" +    
            "3 - Заблокировать счёт по id\n" +      
            "4 - Разблокировать счёт по id\n" +      
            "5 - Информация о счёте по id\n" +     
            "6 - Отсортировать счета по сумме\n" +  
            "7 - Общая сумма по счетам\n" +    
            "8 - Сумма счетов с положительным балансом\n" +                     
            "9 - Сумма счетов с отрицательным балансом\n" +                     
            "\n"
        );   
    } 
    
}
