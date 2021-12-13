/*
 * 2. 
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
package by.epam.classes.aggregation_and_composition.task2;

import java.util.*;

public class Car {
    
    private Wheel wheel;
    private Engine engine;
    private String brand;
    private double consumption;
    private double fuelLevel;
    
    public Car(String brand, double consumption, Engine engine, Wheel wheel, double fuelLevel) {
        this.brand = brand;
        this.consumption = consumption;
        this.engine = engine;
        this.wheel = wheel;
        this.fuelLevel = fuelLevel;
    }
    
    public static Car get(Scanner scanner) {
        Car object = new Car("", 0, new Engine(0, 0), new Wheel(15, Wheel.Type.Winter), 0);
        System.out.print("Car model: ");
        object.brand = scanner.nextLine();
        
        System.out.print("Fuel consumption (100 km): ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Incorrect value!");
            System.out.print("Fuel consumption (100 km): ");
        }
        object.consumption = scanner.nextDouble();
        
        System.out.print("Fuel level: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Incorrect value!");
            System.out.print("Fuel level: ");
        }
        object.fuelLevel = scanner.nextDouble();   
        
        System.out.println("Wheel: ");
        object.wheel = Wheel.get(scanner);
        object.engine = Engine.get(scanner);
        
        return object;
    }
    
    public void move() {
        if (fuelLevel <= 0) {
            System.out.println("Out of fuel!");
            return;
        }
    
        double distance = fuelLevel / consumption;
        System.out.printf("Car passed %.2f km. \n", (distance * 100));
        fuelLevel = 0;
    }
    
    public void addFuel(double fuel) {
        fuelLevel += fuel;
    }
 
    public void changeWheel(Scanner scanner) {
        wheel = Wheel.get(scanner);
    }
    
    @Override
    public String toString() {   
        return brand + " " + engine.toString() + "; " + consumption + 
                " L/100km {Fuil: " + fuelLevel + "}; [" + wheel.toString() + "]";   
    }
    
}
