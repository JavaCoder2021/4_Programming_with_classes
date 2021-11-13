package javacoder2021;

import by.epam.classes.the_simplest_classes_and_objects.*;
import java.util.*;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Airlines airlines = new Airlines();
    
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
    
    private static void menuText() { 
        System.out.print(
            "\n" + 
            "Выберете пункт меню:\n" +
            "0. Выйти\n" +
            "1. Cписок рейсов для заданного пункта назначения\n" +
            "2. Cписок рейсов для заданного дня недели\n" +
            "3. Cписок рейсов для заданного дня недели, время вылета для которых больше заданного\n" +
            "\n"
        );   
    }
    
}
