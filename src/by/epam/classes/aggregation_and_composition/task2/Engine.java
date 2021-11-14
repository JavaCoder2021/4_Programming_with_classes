package by.epam.classes.the_simplest_classes_and_objects;

import java.util.*;

class Engine {
    
    private int number;
    private int power;
 
    public Engine(int number, int power) 
    {
        this.number = number;
        this.power = power;
    }
       
    public static Engine get(Scanner scanner) 
    {
        Engine object = new Engine(0, 0);
        System.out.print("Engine number: ");
        object.number = scanner.nextInt();
        System.out.print("Engine power: ");
        object.power = scanner.nextInt();
        
        return object;
    }
    
    public String toString() 
    {
        return "Engine: " + number + ", Power: " + power;
    }
 
}
