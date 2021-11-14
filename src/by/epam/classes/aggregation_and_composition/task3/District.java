package by.epam.classes.the_simplest_classes_and_objects;

import java.util.*;

public class District {
   
    private String region, district;
    Scanner scanner = new Scanner(System.in);
 
    public District(String region, String district) 
    {
        this.district = district;
    }

    public String getRegion() 
    {
        return region;
    }    
    
    public String getDistrict() 
    {
        return district;
    }
 
    public static District addDistrict() 
    {
        District district = new District("", "");
        System.out.println("Add district: ");
        System.out.println("---------------------------");
        System.out.print("Region name: ");
        district.region = Country.strInput();
        System.out.print("District name: ");
        district.district = Country.strInput();
        System.out.println();
        
        return district;
    }
    
}
