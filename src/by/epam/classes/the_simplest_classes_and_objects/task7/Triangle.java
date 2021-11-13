/*
7.  Описать  класс,  представляющий  треугольник.  
Предусмотреть  методы  для  
- создания объектов,  
- вычисления площади, 
- периметра и 
- точки пересечения медиан.  
*/

package by.epam.classes.the_simplest_classes_and_objects;

public class Triangle {
    
    private Point a, b, c;
    
    public Triangle(Point a_, Point b_, Point c_) 
    {
        a = a_;
        b = b_;
        c = c_;
    }
    
    public double square() 
    {
        double ab = Point.distance(a, b);
        double bc = Point.distance(b, c);
        double ac = Point.distance(a, c);
        
        double p = (ab + bc + ac) / 2;
        
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }
    
    public double perimeter() 
    {
        double ab = Point.distance(a, b);
        double bc = Point.distance(b, c);
        double ac = Point.distance(a, c);
        
        return ab + bc + ac;
    }
    
    public Point median_crossing() 
    {
        return new Point((a.getX() + b.getX() + c.getX()) / 3, (a.getY() + b.getY() + c.getY()) / 3);
    }
    
    public void print() {
        System.out.print("A: ");
        a.print();
        System.out.print("B: ");
        b.print();
        System.out.print("C: ");
        c.print();
    }
    
}
