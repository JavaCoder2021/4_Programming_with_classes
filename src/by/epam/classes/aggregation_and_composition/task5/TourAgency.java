package by.epam.classes.aggregation_and_composition;

import java.util.*;

public class TourAgency {
    
    private List<Client> clientsList = new ArrayList<>();
    private List<Tour>   toursList   = new ArrayList<>();
    
    public static enum TYPE
    {
        Recreation,
        Excursion,
        Treatment,
        Shopping,
        Cruise;
    }
    
    public void createClients()
    {
       clientsList.add(new Client("Vasya",  25, "888-00-44"));
       clientsList.add(new Client("Vova",   35, "555-00-33"));
       clientsList.add(new Client("Kolya",  21, "333-22-11"));
       clientsList.add(new Client("Igor",   31, "222-11-56"));
       clientsList.add(new Client("Sergey", 25, "123-00-77"));
       clientsList.add(new Client("Andrew", 34, "222-01-32"));
    }
    
    public void createTours()
    {
        toursList.add(new Tour(TYPE.Excursion,  "train",    true,  5, 120));
        toursList.add(new Tour(TYPE.Recreation, "bus",      true,  5, 220));
        toursList.add(new Tour(TYPE.Treatment,  "train",    false, 7, 180));
        toursList.add(new Tour(TYPE.Shopping,   "airplane", true,  5, 310));
        toursList.add(new Tour(TYPE.Cruise,     "bus",      false, 7, 200));
        toursList.add(new Tour(TYPE.Excursion,  "ship",     true,  5, 280));        
    }
    
    public void showClients()
    {
        for (Client client : clientsList)
            System.out.println(client.toString());
    }
    
    public void showTours()
    {
        for (Tour tour : toursList)
            System.out.println(tour.toString());
    }
    
    public void toursByCost(int from, int to)
    {
        for (Tour tour : toursList)
            if (tour.getCost() >= from && tour.getCost() <= to)
                System.out.println(tour.toString());
    }
    
    public void toursByTransportFoodDays(String transport, int pFood, int fromDays, int toDays)
    {
        Boolean food = pFood == 0 ? false : true;
        for (Tour tour : toursList)
            if (tour.getTransport().equals(transport) && tour.getFood() == food 
                    && tour.getNumberOfDays() >= fromDays && tour.getNumberOfDays() <= toDays)
                System.out.println(tour.toString());        
    }
    
    public static String strInput() 
    {
        String strInput = "";
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) 
        {
            strInput = sc.nextLine();
        } 
        else 
        {
            System.out.println("Invalid input!");
            strInput();
        }
        return strInput;
    }
    
    public static int numInput() 
    {
        int numInput = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) 
        {
            numInput = sc.nextInt();
        } 
        else 
        {
            System.out.println("Invalid input!");
            numInput();
        }
        return numInput;
    }
    
}
