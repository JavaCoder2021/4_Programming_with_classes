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
    private int sum;
    private int max;
       
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
        sum = a + b;
        System.out.println("sum = " + sum);
    }
    
    public void maxAB()
    {
        if (a >= b)
            max = a;
        else
            max = b;

        System.out.println("max = " + max);
    }
    
}
