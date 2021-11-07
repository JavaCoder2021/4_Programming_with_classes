package javacoder2021;

import by.epam.classes.the_simplest_classes_and_objects.*;

public class JavaCoder2021 {

    public static void main(String[] args) {
               
        Test2 defaultTest2 = new Test2();
        System.out.println("a = " + defaultTest2.getA());        
        System.out.println("b = " + defaultTest2.getB()); 
        
        Test2 test2 = new Test2(20, 15);
        test2.setA(10);
        test2.setB(5);
        System.out.println("a = " + test2.getA());        
        System.out.println("b = " + test2.getB());
        
    }
    
}
