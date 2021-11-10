/*
6.  
Составьте  описание  класса  для  представления  времени.  
Предусмотрите  возможности установки  времени и изменения его отдельных полей (час, минута, секунда) 
с проверкой допустимости вводимых значений. 
В случае недопустимых  значений полей  поле  устанавливается  в  значение  0.  
Создать  методы  изменения  времени на заданное количество часов, минут и секунд.
*/

package by.epam.classes.the_simplest_classes_and_objects;

public class Time {
    
    private int sec, min, hours;
        
    public Time(int hours_, int min_, int sec_)
    {
        setTime(hours_, min_, sec_);
    }
    
    public void setTime(int hours_, int min_, int sec_)
    {
        if (sec_ >=0 && sec_ < 60)
            sec = sec_;
        else
            sec = 0;
        if (min_ >=0 && min_ < 60)
            min = min_;
        else
            min = 0;
        if (hours_ >=0 && hours_ < 24)
            hours = hours_;
        else
            hours = 0;
    }
    
    public void setSec(int sec_)
    {
        if (sec_ >=0 && sec_ < 60)
            sec = sec_;
        else
            sec = 0;
    }
    
    public void setMin(int min_)
    {
        if (min_ >=0 && min_ < 60)
            min = min_;
        else
            min = 0;           
    }
    
    public void setHours(int hours_)
    {
        if (hours_ >=0 && hours_ < 24)
            hours = hours_;
        else
            hours = 0;         
    }   
    
    public void addTime(int hours_, int min_, int sec_)
    {
        if (sec_ >=0)
        {
            sec += sec_ % 60;
            min += (sec_ / 60) % 60;
        }
        if (min_ >=0)
        {
            min += min_ % 60;
            hours += (min_ / 60) % 60;
        }
        if (hours_ >=0)
        {
            hours += hours_;
            if (hours >= 24)
                hours = hours % 24;
        }
    }
    
    public void showTime()
    {    
        System.out.printf("%02d:%02d:%02d\n", hours, min, sec);
    }
    
}
