/*
5. 
Туристические путевки. 
Сформировать набор предложений клиенту по выбору туристической путевки различного типа 
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
Учитывать возможность выбора транспорта, питания и числа дней. 
Реализовать выбор и сортировку путевок. 
*/

package by.epam.classes.aggregation_and_composition;

public class Tour {

    private TourAgency.TYPE type;
    private String transport;
    private boolean food;
    private int numberOfDays;
    private int cost;
	    
    public Tour(TourAgency.TYPE type, String transport, boolean food, int numberOfDays, int cost) 
    {
        this.type         = type;
        this.transport    = transport;
        this.food         = food;
        this.numberOfDays = numberOfDays;
        this.cost         = cost;
    }
    
    public TourAgency.TYPE getType()
    {
        return type;
    }
    
    public String getTransport()
    {
        return transport;
    }
    
    public boolean getFood()
    {
        return food;
    }
    
    public int getNumberOfDays()
    {
        return numberOfDays;
    }
	
    public int getCost() 
    {
        return cost;
    }
    
    public void setType(TourAgency.TYPE type) 
    {
        this.type = type;
    }    
    
    public void setTransport(String transport) 
    {
        this.transport = transport;
    }
    
    public void setFood(boolean food)
    {
        this.food = food;
    }
    
    public void setNumberOfDays(int numberOfDays)
    {
        this.numberOfDays = numberOfDays;
    }
    
    public void setCost(int cost) 
    {
        this.cost = cost;
    }
    
    @Override
    public String toString() 
    {
        return "Type: " + type.toString() + "; Transport: " + transport + "; Food: " + food 
                + "; Number of days: " + numberOfDays + "; Cost: " + cost + ";";
    }
    
}
