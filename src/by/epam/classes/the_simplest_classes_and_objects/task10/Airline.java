/*
10. 
Создать класс Airline, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод  toString(). 
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.  
 
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.  
Найти и вывести:  
a) список рейсов для заданного пункта назначения;  
b) список рейсов для заданного дня недели;  
c) список рейсов для заданного дня недели, время вылета для которых больше заданного. 
*/

package by.epam.classes.the_simplest_classes_and_objects;

public class Airline {
    
    private int number;
    private String destination, aircraftType, departureTime, daysOfWeek;
    
    public Airline(String destination, int number, String aircraftType, String departureTime, String daysOfWeek)
    {
        this.destination    = destination;
        this.number         = number;  
        this.aircraftType   = aircraftType;
        this.departureTime  = departureTime;
        this.daysOfWeek     = daysOfWeek;        
    }
    
    public void setDestination(String destination) 
    {
        this.destination = destination;
    }    
    
    public void setNumber(int number) 
    {
        this.number = number;
    }  
    
    public void setAircraftType(String aircraftType) 
    {
        this.aircraftType = aircraftType;
    }
    
    public void setDepartureTime(String departureTime) 
    {
        this.departureTime = departureTime;
    }
    
    public void setDaysOfWeek(String daysOfWeek)
    {
        this.daysOfWeek = daysOfWeek;
    }
    
    public String getDestination() 
    {
        return destination;
    }
    
    public int getNumber() 
    {
        return number;
    }
    
    public String getAircraftType() 
    {
        return aircraftType;
    }
    
    public String getDepartureTime() 
    {
        return departureTime;
    }
 
    public String getDaysOfWeek() 
    {
        return daysOfWeek;
    }    
    
    @Override
    public String toString()
    {
        return number + ". " + aircraftType + " --> " + destination + " - " + daysOfWeek + " - " + departureTime;
    }
    
    public void print() 
    {
        System.out.println(toString());
    }   
    
}
