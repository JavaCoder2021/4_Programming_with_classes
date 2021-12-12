/*
 * 10. 
 * Создать класс Airline, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль.  
 *  
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.  
 * Найти и вывести:  
 * a) список рейсов для заданного пункта назначения;  
 * b) список рейсов для заданного дня недели;  
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного. 
 */
package by.epam.classes.the_simplest_classes_and_objects.task10;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Airlines airlines = new Airlines();
    
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
                    airlines.sortByDestination(input);
                    break;           
                case 2:
                    airlines.sortByDaysOfWeek(input);
                    break;           
                case 3:
                    airlines.sortByDepartureTime(input);
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
            "1. List of flights for a given destination\n" +
            "2. List of flights for a given day of the week\n" +
            "3. List of flights for a given day of the week, the departure time for which is longer than the specified one\n" +
            "\n"
        );   
    }
    
}
