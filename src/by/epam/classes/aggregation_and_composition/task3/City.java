/*
3. 
Создать объект класса Государство, используя классы Область, Район, Город. 
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.  
*/

package by.epam.classes.aggregation_and_composition;

public class City {
    
    private String district, city;
 
    public City(String city) 
    {
        this.city = city;
    }
 
    public String getCity() 
    {
        return city;
    }
    
    public String getDistrict() 
    {
        return district;
    }
 
    public static City addCity()
    {
        City city = new City("");
        System.out.println("Add city: ");
        System.out.println("---------------------------");
        System.out.print("District name: ");
        city.district = Country.strInput();
        System.out.print("City name: ");
        city.city = Country.strInput();
        System.out.println();
        
        return city;
    }
    
}
