package by.epam.classes.aggregation_and_composition.task4;

import java.util.Comparator;

public class BankAccount {
    
    private int id = 0;
    private static int  ID          = 0;
    private String      bankAccount;
    private boolean     blocked;
    private int         sum         = 0;
    
    public BankAccount(int sum) {
        id = ++ID;
        bankAccount = String.format("%08d", id);        
        blocked = false;
        this.sum = sum;
    }
    
    public int getId() {
        return id;
    }
    
    public int getSum() {
        return sum;
    }    
    
    public void toBlockAccount() {
        blocked = true;
    }
    
    public void toUnblockAccount() {
        blocked = false;
    }
    
    public static BankAccount createBankAccount(int sum) {        
        BankAccount bankAccount = new BankAccount(sum);
        
        return bankAccount;
    }
    
    public static class ByNumberComparator implements Comparator < BankAccount > {
        @Override
        public int compare(BankAccount left, BankAccount right) {
            return right.sum - left.sum;
        }
    }
    
    @Override
    public String toString(){
        return "Id = " + id + "; Bank account №" + bankAccount + "; sum = " + sum + "; " + "blocked = " + blocked;
    }
    
}
