/*
 * 2. 
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
package by.epam.classes.aggregation_and_composition.task2;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Car car = Car.get(scanner);
        int choice;
        
        while (true) {
            
            menuText();
            choice = scannerInt();
            if (choice == 0)
                break;
            if (choice < 0 || choice > 4) {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice) {
                case 1:
                    car.move();
                    break;           
                case 2:
                    System.out.print("Add fuel (L): ");
                    double fuel = scanner.nextDouble();
                    car.addFuel(fuel);
                    break;           
                case 3:
                    car.changeWheel(scanner);
                    break; 
                case 4:
                    System.out.println(car.toString());
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
            "1. Go\n" +
            "2. Refuel\n" +
            "3. Change the wheel\n" +
            "4. Display the brand of the car on the console\n" +                   
            "\n"
        );   
    }    
    
}
