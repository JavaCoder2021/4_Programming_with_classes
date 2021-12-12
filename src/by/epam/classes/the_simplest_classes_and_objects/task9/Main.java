/*
 * 9. 
 * Создать класс Book, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод toString(). 
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.  
 *  
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  
 * Найти и вывести:  
 * a) список книг заданного автора;  
 * b) список книг, выпущенных заданным издательством;  
 * c) список книг, выпущенных после заданного года. 
 */
package by.epam.classes.the_simplest_classes_and_objects.task9;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Books books = new Books();
    
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
                    books.sortByAuthor(input);
                    break;           
                case 2:
                    books.sortByPublisher(input);
                    break;           
                case 3:
                    books.sortByYear(input);
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
        } while (num < 0);

        return num;
        
    }
    
    private static void menuText() { 
        System.out.print(
            "\n" + 
            "Select the menu item:\n" +
            "0. Exit\n" +
            "1. Display the books of this author\n" +
            "2. Display books published by the specified publisher\n" +
            "3. Display books published after a given year\n" +
            "\n"
        );   
    }
    
}
