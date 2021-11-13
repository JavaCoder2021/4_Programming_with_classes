package by.epam.classes.the_simplest_classes_and_objects;

import java.util.*;

public class Airlines {
    
    LinkedList<Airline> airlines = new LinkedList();
    
    public Airlines()
    {
        addAirlines();
    }
    
    public void addAirlines() 
    {
        airlines.add(new Airline("Moscow",  105,    "Boing",    "13.55", "Monday"));
        airlines.add(new Airline("Minsk",   35,     "Boing",    "10.05", "Saturday"));
        airlines.add(new Airline("Kiev",    125,    "Boing",    "09.20", "Sunday"));
        airlines.add(new Airline("Moscow",  55,     "Boing",    "21.45", "Sunday"));
        airlines.add(new Airline("Minsk",   45,     "Boing",    "19.15", "Wednesday"));
    }
       
    public void sortByDestination(Scanner input) 
    {
        System.out.print("Destination: ");
        String destination = input.nextLine();
        for (Airline mbr : airlines) 
            if (destination.equals(mbr.getDestination()))
                mbr.print();
    }
    
    public void sortByDaysOfWeek(Scanner input) 
    {
        System.out.print("Day of week: ");
        String daysOfWeek = input.nextLine();
        for (Airline mbr : airlines) 
        {    
            if (daysOfWeek.equals(mbr.getDaysOfWeek()))
                mbr.print();
        }
    }
    
    public void sortByDepartureTime(Scanner input) 
    {
        System.out.print("Day of week: ");
        String daysOfWeek = input.nextLine();
        System.out.print("Departure time: ");
        String departureTime = input.nextLine();
        for (Airline mbr : airlines) 
        {    
            if (daysOfWeek.equals(mbr.getDaysOfWeek()) && (Double.valueOf(mbr.getDepartureTime()) > Double.valueOf(departureTime)))
                mbr.print();
        }
    }    
    
}
