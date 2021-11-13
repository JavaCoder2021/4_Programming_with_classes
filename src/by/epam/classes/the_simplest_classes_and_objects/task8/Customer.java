/*
8. 
Создать класс Customer, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод  toString(). 
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль.  
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  
Найти и вывести:  
a) список покупателей в алфавитном порядке;  
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*/

package by.epam.classes.the_simplest_classes_and_objects;

import java.util.*;

public class Customer {
    
    private static int ID = 0;
    private int id;
    private String surname, name, patronymic, address, creditCardNumber, bankAccountNumber;
    
    public Customer(String surname_, String name_, String patronymic_, String address_, 
            String creditCardNumber_, String bankAccountNumber_)
    {
        id = ID++;
        surname = surname_;
        name = name_;
        patronymic = patronymic_;
        address = address_;
        creditCardNumber = creditCardNumber_;
        bankAccountNumber = bankAccountNumber_;
    }
    
    public void setSurname(String surname_) {
        surname = surname_;
    }    
    
    public void setName(String name_) {
        name = name_;
    }  
    
    public void setPatronymic(String patronymic_) {
        patronymic = patronymic_;
    }
    
    public void setAddress(String address_) {
        address = address_;
    }
    
    public void setCreditCardNumber(String creditCardNumber_)
    {
        creditCardNumber = creditCardNumber_;
    }
    
    public void setBankAccountNumber(String bankAccountNumber_)
    {
        bankAccountNumber = bankAccountNumber_;
    }
    
    public int getId() {
        return id;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public String getName() {
        return name;
    }
 
    public String getPatronymic() {
        return patronymic;
    }
 
    public String getAddress() {
        return address;
    }    
    
    public String getCreditCardNumber()
    {
        return creditCardNumber;
    }
    
    public String getBankAccountNumber()
    {
        return bankAccountNumber;
    }
    
    public static Customer setCustomer(Scanner scanner) 
    {
        Customer customer = new Customer("", "", "", "", "", "");
        System.out.print("Surname: ");
        customer.surname = scanner.nextLine();        
        System.out.print("Name: ");
        customer.name = scanner.nextLine();
        System.out.print("Patronymic: ");
        customer.patronymic = scanner.nextLine();
        System.out.print("Address: ");
        customer.address = scanner.nextLine();
        System.out.print("Credit сard number: ");
        customer.creditCardNumber = scanner.nextLine();
        System.out.print("Bank account number: ");
        customer.bankAccountNumber = scanner.nextLine();
        
        return customer;
    }
    
    @Override
    public String toString()
    {
        return id + ", " + surname + ", " + name + ", " + patronymic + 
            ". credit card number: " + creditCardNumber + ", bank account number: " + bankAccountNumber;
    }
    
    public void print() 
    {
        System.out.println(toString());
    }
    
    public static class BySurnameComparator implements Comparator < Customer > 
    {
        @Override
        public int compare(Customer left, Customer right) 
        {
            if (left.surname != right.surname)
            return left.surname.compareTo(right.surname);
            if (left.name != right.name)
            return left.name.compareTo(right.name);
            return left.patronymic.compareTo(right.patronymic);
        }
    }
    
}
