package by.epam.classes.the_simplest_classes_and_objects.task8;

import java.util.*;

public class Customers {
  
    LinkedList<Customer> customers = new LinkedList();
    
    public void addCustomer(Scanner scanner) {
        Customer customer = Customer.setCustomer(scanner);
        customers.add(customer);
    }
    
    public void print() {
        for (Customer mbr : customers) 
        {
            mbr.print();
        }
    }
       
    public void sortByName() {
        Collections.sort(customers, new Customer.BySurnameComparator());
    }
    
    public void sortCards(String a, String b) {
        for (Customer nowCustomer : customers) {
            if (nowCustomer.getCreditCardNumber().compareTo(a) >= 0 &&
            nowCustomer.getCreditCardNumber().compareTo(b) <= 0)
            nowCustomer.print();
        }
    }
    
}
