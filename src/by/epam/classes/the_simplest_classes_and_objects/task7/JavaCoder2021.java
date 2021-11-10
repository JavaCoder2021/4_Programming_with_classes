package javacoder2021;

import by.epam.classes.the_simplest_classes_and_objects.*;
import java.util.Scanner;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        
        System.out.println("Enter point A: ");
        a.read(scanner);
        System.out.println("Enter point B: ");
        b.read(scanner);
        System.out.println("Enter point C: ");
        c.read(scanner);
               
        Triangle triangle = new Triangle(a, b, c);
        triangle.print();
        
        System.out.println("Square: " + triangle.square());
        
        System.out.println("Perimeter: " + triangle.perimeter());
        
        System.out.print("medianCrossing: ");
        triangle.median_crossing().print();
        
    }
    
}
