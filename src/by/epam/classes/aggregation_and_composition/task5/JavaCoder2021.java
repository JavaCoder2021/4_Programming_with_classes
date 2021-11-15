package javacoder2021;

import by.epam.classes.aggregation_and_composition.*;
import java.util.*;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        
        TourAgency tourAgency = new TourAgency(); 
        tourAgency.createClients();
        tourAgency.createTours();
        
        int choice, from, to;
        
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
                    System.out.println("List of clients:");
                    tourAgency.showClients();
                    break; 
                case 2:
                    System.out.println("List of tours:");
                    tourAgency.showTours();
                    break;
                case 3:
                    System.out.println("List of tours by cost: ");
                    System.out.print("From: ");
                    from = TourAgency.numInput();
                    System.out.print("To: ");
                    to = TourAgency.numInput();
                    tourAgency.toursByCost(from, to);
                    break; 
                case 4:
                    System.out.println("List of tours by transport, food, days: ");
                    System.out.print("Transport: ");
                    String transport = TourAgency.strInput();
                    System.out.print("Food (1 - true, 0 - false): ");
                    int food = TourAgency.numInput();
                    System.out.println("Number of days: ");
                    System.out.print("From: ");
                    from = TourAgency.numInput();
                    System.out.print("To: ");
                    to = TourAgency.numInput();
                    tourAgency.toursByTransportFoodDays(transport, food, from, to);
                    break;
            }     
            
        }
        
    }
    
    private static void menuText() { 
        System.out.print(
            "\n" + 
            "0 - Выход\n" +
            "1 - Список клиентов\n" +   
            "2 - Список туров\n" +   
            "3 - Список туров по стоимости\n" + 
            "4 - Список туров по транспорту, питанию, количеству дней\n" + 
            "\n"
        );   
    } 
    
}
