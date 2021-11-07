package javacoder2021;

import by.epam.classes.the_simplest_classes_and_objects.*;

public class JavaCoder2021 {

    public static void main(String[] args) {
              
        Counter a = new Counter(5, 10, 6);
        Counter b = new Counter(6, 4, 7);
        Counter c = new Counter(5, 3);
        
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
        System.out.println("----------------------");
        
        for (int i = 0; i < 2; ++i) 
        {
            a.inc();
            b.inc();
            c.inc();
        }
        
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
        System.out.println("----------------------");
        
        for (int i = 0; i < 20; ++i) 
        {
            a.dec();
            b.dec();
            c.dec();
        }
        
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
        System.out.println("----------------------");
            
    }

}
