/*
 * 8. 
 * Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.  
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  
 * Найти и вывести:  
 * a) список покупателей в алфавитном порядке;  
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
package by.epam.classes.the_simplest_classes_and_objects.task8;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Customers customers = new Customers();
    
        Scanner input = new Scanner(System.in);
        int choice;
        
        while (true) {
            menuText();
            choice = scannerInt();
            if (choice == 0)
                break;
            if (choice < 0 || choice > 3) {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice) {
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
    
    private static int scannerInt() {
        
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        do {
            if (input.hasNextInt()) {
                num = input.nextInt();
            } 
            else {
                input.next();
            }
        } while (num <= 0);

        return num;
        
    }
    
    private static void menuText() { 
        System.out.print(
            "\n" + 
            "Select the menu item:\n" +
            "0. Exit\n" +
            "1. Add customer\n" +
            "2. Display of buyers in alphabetical order\n" +
            "3. Display of buyers with a credit card in the interval\n" +
            "\n"
        );   
    }
    
}
