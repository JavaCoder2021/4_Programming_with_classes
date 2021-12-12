/*
 * 1.  
 * - Создайте  класс  Test1  двумя  переменными.  
 * - Добавьте  метод  вывода  на  экран  и  методы  изменения  этих переменных. 
 * - Добавьте метод,  который  находит  сумму  значений  этих  переменных,  
 * - и  метод,  который  находит наибольшее значение из этих двух переменных. 
 */
package by.epam.classes.the_simplest_classes_and_objects.task1;

public class Main {
    
    public static void main(String[] args) {
               
        Test1 test1 = new Test1();
        test1.setA(5);
        test1.setB(10);
        test1.displayA();
        test1.displayB();
        test1.sumAB();
        test1.maxAB();
        
    }
    
}
