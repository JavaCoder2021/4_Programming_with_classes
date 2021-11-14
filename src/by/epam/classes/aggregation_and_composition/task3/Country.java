/**
3. 
* Создать объект класса Государство, используя классы Область, Район, Город. 
* Методы: вывести на консоль столицу, количество областей, площадь, областные центры.  
*/

package by.epam.classes.aggregation_and_composition;

import java.util.*;

public class Country {
    
    static int numInput;
    static double doubleInput;
    static String strInput;
    String country, capital;
    private List<Region> regionsList = new ArrayList<>();
    private List<District> districtsList = new ArrayList<>();
    private List<City> citiesList = new ArrayList<>();
 
    public Country(String country, String capital) 
    {
        this.country = country;
        this.capital = capital;
    }
 
    public String getCountry() 
    {
        return country;
    }
 
    public String getCapital() 
    {
        return capital;
    }
 
    public List getRegionList() 
    {
        return regionsList;
    }
 
    public static String strInput() 
    {
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
 
    public static double doubleInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) 
        {
            doubleInput = sc.nextDouble();
        } 
        else 
        {
            System.out.println("Invalid input!");
            doubleInput();
        }
        return doubleInput;
    }
    
    public void addCity(City city) 
    {
        this.citiesList.add(city);
    }
    
    public void addDistrict(District district) 
    {
        this.districtsList.add(district);
    }
 
    public void addRegion() 
    {
        this.regionsList.add(Region.addRegion());
        this.districtsList.add(District.addDistrict());
        this.citiesList.add(City.addCity());
    }    
    
    public double squareRegions()
    {
        double square = 0;
        for (Region region : regionsList)
        {
            square += region.getSquare();
        }
        
        return square;
    }
    
    public void regionalCities()
    {
        int i = 0;
        for(Region region: regionsList)
        {
            i++;
            System.out.println(i + ". " + region.getRegionCity());
        }
    }
    
}
