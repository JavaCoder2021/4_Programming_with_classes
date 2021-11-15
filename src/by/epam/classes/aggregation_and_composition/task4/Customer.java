/*
4. 
Счета. Клиент может иметь несколько счетов в банке. 
- Учитывать возможность блокировки/разблокировки счета. 
- Реализовать поиск и сортировку счетов. 
- Вычисление общей суммы по счетам. 
- Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно. 
*/

package by.epam.classes.aggregation_and_composition;

import java.util.*;

public class Customer {
    
    private List<BankAccount> accountsList = new ArrayList<>();
    private String surname, name, patronymic, address, passportData;
    
    public Customer(String surname, String name, String patronymic, String address, String passportData)
    {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.passportData = passportData;
    }
    
    public static Customer setCustomer(Scanner scanner) 
    {
        Customer customer = new Customer("", "", "", "", "");
        System.out.print("Surname: ");
        customer.surname = scanner.nextLine();        
        System.out.print("Name: ");
        customer.name = scanner.nextLine();
        System.out.print("Patronymic: ");
        customer.patronymic = scanner.nextLine();
        System.out.print("Address: ");
        customer.address = scanner.nextLine();
        System.out.print("Passport data: ");
        customer.passportData = scanner.nextLine();
        
        return customer;
    }
    
    public void createBankAccount(int sum)
    {
       accountsList.add(BankAccount.createBankAccount(sum));
    }
    
    public void bankAccountInfo()
    {
       for (BankAccount bankAccount : accountsList)
           System.out.println(bankAccount.toString());
    }
    
    public void toBlockAccount(int id)
    {
        for (BankAccount bankAccount : accountsList)
            if (bankAccount.getId() == id)
                bankAccount.toBlockAccount();
    }
    
    public void toUnblockAccount(int id)
    {
        for (BankAccount bankAccount : accountsList)
            if (bankAccount.getId() == id)
                bankAccount.toUnblockAccount();
    }
    
    public void accountInfo(int id)
    {
        if (id >=0 && id < accountsList.size())
        {
            for (BankAccount bankAccount : accountsList)
                if (bankAccount.getId() == id)
                    System.out.println(bankAccount.toString());
        }
        else 
            System.out.println("Incorrect choose!");
    }
    
    public void sortBankAccount()
    {
        Collections.sort(accountsList, new BankAccount.ByNumberComparator());
        for (BankAccount bankAccount : accountsList)
                System.out.println(bankAccount.toString());
    }    
    
    public int totalSum()
    {
        int sum = 0;
        for (BankAccount bankAccount : accountsList)
            sum += bankAccount.getSum();
        
        return sum;
    }
    
    public int positiveSum()
    {
        int sum = 0;
        for (BankAccount bankAccount : accountsList)
            if (bankAccount.getSum() > 0)
                sum += bankAccount.getSum();
        
        return sum;
    } 
    
    public int negativeSum()
    {
        int sum = 0;
        for (BankAccount bankAccount : accountsList)
            if (bankAccount.getSum() < 0)
                sum += bankAccount.getSum();
        
        return sum;
    }
    
    public static int numInput() 
    {
        int numInput = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) 
        {
            numInput = sc.nextInt();
        } 
        else 
        {
            System.out.println("Invalid input!");
            numInput();
        }
        return numInput;
    }
    
}
