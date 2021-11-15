package by.epam.classes.aggregation_and_composition;

public class Client {
    
    private String clientName;
    private int    clientAge;
    private String clientPhoneNumbers;
        
    public Client(String clientName, int clientAge, String clientPhoneNumbers)
    {
        this.clientName         = clientName;
        this.clientAge          = clientAge;
        this.clientPhoneNumbers = clientPhoneNumbers;
        
    } 
    
    public String getClientName()
    {
        return clientName;
    }    
    
    public int getClientAge()
    {
        return clientAge;
    }
    
    public String getClientPhoneNumbers()
    {
        return clientPhoneNumbers;
    }    
     
    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }
    
    public void setClientAge(int clientAge)
    {
        this.clientAge = clientAge;
    }
    
    public void setClientPhoneNumbers(String clientPhoneNumbers)
    {
        this.clientPhoneNumbers = clientPhoneNumbers;
    }

    @Override
    public String toString()
    {
        return "Name: " + clientName + "; Age: " + clientAge + "; Phone number: " + clientPhoneNumbers + ";";
    }    
    
}
