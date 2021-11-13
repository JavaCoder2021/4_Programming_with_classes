package javacoder2021;

import by.epam.classes.the_simplest_classes_and_objects.*;
import java.util.*;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Customers customers = new Customers();
    
        Scanner input = new Scanner(System.in);
        int choice;
        
        while (true)
        {
            menuText();
            choice = Integer.parseInt(input.nextLine());
            if (choice == 0)
                break;
            if (choice < 0 || choice > 3) 
            {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice)
            {
                case 1:
                    customers.addCustomer(input);
                    break;           
                case 2:
                    customers.sortByName();
                    customers.print();
                    break;           
                case 3:
                    System.out.println("Enter your credit card range\n");
                    System.out.println("From: ");
                    String from = input.nextLine();
                    System.out.println("Before: ");
                    String before = input.nextLine();
                    customers.sortCards(from, before);
                break;             
            }     
            
        }    
        
    }
    
    private static void menuText() { 
        System.out.print(
            "\n" + 
            "Выберете пункт меню:\n" +
            "0. выйти\n" +
            "1. добавить покупателя\n" +
            "2. вывод покупателей в алфавитном порядке\n" +
            "3. вывод покупателей с кредитной картой в интервале\n" +
            "\n"
        );   
    }
    
}
