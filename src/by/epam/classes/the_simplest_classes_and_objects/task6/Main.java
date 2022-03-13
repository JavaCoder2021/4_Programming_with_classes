/*
 * 6.  
 * Составьте  описание  класса  для  представления  времени.  
 * Предусмотрите  возможности установки  времени и изменения его отдельных полей (час, минута, секунда) 
 * с проверкой допустимости вводимых значений. 
 * В случае недопустимых  значений полей  поле  устанавливается  в  значение  0.  
 * Создать  методы  изменения  времени на заданное количество часов, минут и секунд.
 */
package by.epam.classes.the_simplest_classes_and_objects.task6;

public class Main {
    
    public static void main(String[] args) {
        
        Time time = new Time(5, 24, 35);
        System.out.println(time);
        
        time.setTime(10, 67, 34);
        System.out.println(time);
        
        time.setHours(13);
        time.setMin(24);
        time.setSec(35);
        System.out.println(time);
        
        time.addTime(10, 50, 50);
        System.out.println(time);
        
        time.addSeconds(50);
        System.out.println(time);

        time.addMinutes(50);
        System.out.println(time);

        time.addHours(5);
        System.out.println(time);       
        
    }
    
}
