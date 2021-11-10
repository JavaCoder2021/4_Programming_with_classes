package javacoder2021;

import by.epam.classes.the_simplest_classes_and_objects.Time;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Time time = new Time(5, 24, 35);
        time.showTime();
        
        time.setTime(10, 67, 34);
        time.showTime();
        
        time.setHours(13);
        time.setMin(24);
        time.setSec(35);
        time.showTime();
        
        time.addTime(11, 60, 60);
        time.showTime();
        
    }
    
}
