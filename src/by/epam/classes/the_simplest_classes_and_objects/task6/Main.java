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
        time.showTime();
        
        time.setTime(10, 67, 34);
        time.showTime();
        
        time.setHours(13);
        time.setMin(24);
        time.setSec(35);
        time.showTime();
        
        time.addTime(10, 50, 50);
        time.showTime();
        
        time.addSeconds(50);
        time.showTime();

        time.addMinutes(50);
        time.showTime();

        time.addHours(5);
        time.showTime();        
        
    }
    
}
