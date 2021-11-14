package by.epam.classes.aggregation_and_composition;

import java.util.*;

public class Region {
    
    private String region, regionCity;
    private double square;
 
    public Region(String region, String regionCity, double square) 
    {
        this.region = region;
        this.square = square;
    }
 
    public String getRegion() 
    {
        return region;
    }
    
   public String getRegionCity() 
    {
        return regionCity;
    }
 
    public double getSquare() 
    {
        return square;
    }
 
    public static Region addRegion() 
    {
        Region region = new Region("", "", 0);
        System.out.println("Add region: ");
        System.out.println("---------------------------");        
        System.out.print("Region name: ");
        region.region = Country.strInput();
        System.out.print("Region city: ");
        region.regionCity = Country.strInput();
        System.out.print("Square (km2): ");
        region.square = Country.doubleInput();
        System.out.println();
        
        return region;
    }
    
}
