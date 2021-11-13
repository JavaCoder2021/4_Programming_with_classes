package by.epam.classes.the_simplest_classes_and_objects;

import java.util.Scanner;

public class Point {
    
    private double x, y;
    
    public Point(double x_, double y_) 
    {
        x = x_;
        y = y_;
    }
       
    public Point() 
    {
        this(0, 0);
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public static double distance(Point a, Point b) 
    {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public void print() 
    {
        System.out.printf("x: %.2f, y: %.2f \n", x, y);
    }
    
    public void read(Scanner scanner) 
    {
        System.out.print("x: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Invalid input!");
            System.out.print("x: ");
        }
        x = scanner.nextDouble();       
        
        System.out.print("y: ");
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Invalid input!");
            System.out.print("y: ");
        }
        y = scanner.nextDouble(); 
    }    
    
}
