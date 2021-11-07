/*
1.  
- Создайте  класс  Test1  двумя  переменными.  
- Добавьте  метод  вывода  на  экран  и  методы  изменения  этих переменных. 
- Добавьте метод,  который  находит  сумму  значений  этих  переменных,  
- и  метод,  который  находит наибольшее значение из этих двух переменных. 
*/

package by.epam.classes.the_simplest_classes_and_objects;

public class Test1 {
    
    private int a;
    private int b;
       
    public void setA(int a)
    {
        this.a = a;
    }
    
    public void setB(int b)
    {
        this.b = b;
    }
    
    public void displayA()
    {
        System.out.println("a = " + a);
    }
    
    public void displayB()
    {
        System.out.println("b = " + b);
    }
    
    public void sumAB()
    {
        int sum = a + b;
        System.out.println("sum a + b = " + sum);
    }
    
    public void maxAB()
    {
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("b > a");
    }
    
}
