/*
 * 3. 
 * Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.  
 */
package by.epam.classes.aggregation_and_composition.task3;

public class Main {
    
    public static void main(String[] args) {
        
        Country country = new Country("Belarus", "Minsk");
        int choice;
        
        while (true) {
            menuText();
            choice = Country.numInput();
            if (choice == 0)
                break;
            if (choice < 0 || choice > 5) {
                System.out.println("Incorrect choose!");
                continue;
            }
                      
            switch (choice) {
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
            "0 - Exit\n" +
            "1 - Add area\n" +
            "2 - Display the capital\n" +
            "3 - Number of areas\n" +
            "4 - Area\n" +
            "5 - Regional centers\n" +                   
            "\n"
        );   
    } 
    
}
