/*
 * 7.
 * Описать  класс,  представляющий  треугольник.  
 * Предусмотреть  методы  для  
 * - создания объектов,  
 * - вычисления площади, 
 * - периметра и 
 * - точки пересечения медиан.  
 */
package by.epam.classes.the_simplest_classes_and_objects.task7;

import java.util.Scanner;

public class Main {
    
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
