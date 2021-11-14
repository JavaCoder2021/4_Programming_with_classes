package javacoder2021;

import by.epam.classes.aggregation_and_composition.*;
import java.util.*;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Country country = new Country("Belarus", "Minsk");
        
        int choice;
        
        while (true)
        {
            menuText();
            choice = scanner.nextInt();
            if (choice == 0)
                break;
            if (choice < 0 || choice > 5) 
            {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice)
            {
                case 1:
                    country.addRegion();
                    break;           
                case 2:
                    System.out.println("Capital: " + country.getCapital());
                    break;           
                case 3:
                    System.out.println("Number of regions: " + country.getRegionList().size());
                    break; 
                case 4:
                    System.out.println("Area of all regions: " + country.squareRegions());
                    break;
                case 5:
                    System.out.println("Regional cities: ");
                    country.regionalCities();
                    break;
            }     
            
        } 
        
    }
    
    private static void menuText() { 
        System.out.print(
            "\n" + 
            "0 - Выход\n" +
            "1 - Добавить область\n" +
            "2 - Вывести столицу\n" +
            "3 - Количество областей\n" +
            "4 - Площадь\n" +
            "5 - Областные центры\n" +                   
            "\n"
        );   
    } 
    
}
