package javacoder2021;

import by.epam.classes.the_simplest_classes_and_objects.*;
import java.util.*;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
                Car car = Car.get(scanner);
        
        int choice;
        
        while (true)
        {
            menuText();
            choice = scanner.nextInt();
            if (choice == 0)
                break;
            if (choice < 0 || choice > 4) 
            {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice)
            {
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
    
    private static void menuText() { 
        System.out.print(
            "\n" + 
            "Выберете пункт меню:\n" +
            "0. Выйти\n" +
            "1. Ехать\n" +
            "2. Заправляться\n" +
            "3. Менять колесо\n" +
            "4. Вывести на консоль марку автомобиля\n" +                   
            "\n"
        );   
    }    
    
}
