package by.epam.classes.aggregation_and_composition.task2;

import java.util.*;

class Wheel {
    
    public enum Type { Winter, Summer }
  
    private double diameter;
    private Type type;
  
    public Wheel(double diameter, Type type) {
        this.diameter = diameter;
        this.type = type;
    }
  
    public static Wheel get(Scanner scanner) {
        Wheel object = new Wheel(0, Type.Winter);
       
        System.out.print("Diameter: ");
        object.diameter = scanner.nextDouble();
    
        System.out.print("Type (1) - Winter, (2) - Summer: ");
        while (true) {
            int value = scanner.nextInt();
            if (value == 1) {
                object.type = Type.Winter;
                break;
            }
            if (value == 2) {
                object.type = Type.Summer;
                break;
            }
            System.out.print("Incorrect value!");
        }
        System.out.println("Wheel complete!");
        
        return object;
    }
  
    public double getDiameter() {
        return diameter;
    }
    
    @Override
    public String toString() {     
        return "d = " + diameter + "; " + (type == Type.Winter ? "Winter" : "Summer");
    }
    
}
