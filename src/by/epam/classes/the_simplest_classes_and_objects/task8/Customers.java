package by.epam.classes.the_simplest_classes_and_objects;

import java.util.*;

public class Customers {
  
    LinkedList<Customer> customers = new LinkedList();
    
    public void addCustomer(Scanner scanner) 
    {
        Customer customer = Customer.setCustomer(scanner);
        customers.add(customer);
    }
    
    public void print() 
    {
        for (Customer mbr : customers) 
        {
            mbr.print();
        }
    }
       
    public void sortByName() 
    {
        Collections.sort(customers, new Customer.BySurnameComparator());
    }
    
    public void sortCards(String a, String b) 
    {
        for (int i = 0; i < customers.size(); i++) 
        {
            if (customers.get(i).getCreditCardNumber().compareTo(a) >= 0 &&
            customers.get(i).getCreditCardNumber().compareTo(b) <= 0)
            customers.get(i).print();
        }
    }
    
}
