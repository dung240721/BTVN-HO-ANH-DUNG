package accountpkg;

import Bankpkg.Bank;
import java.text.DecimalFormat;
import Bankpkg.ITransaction;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SavingAccount extends  Account implements ITransaction{
    private double dailyInterest;
    private int daysOfYear;

    public SavingAccount (String accountNumber, String accountHolderName, String accountType, double balance, int daysOfYear ){
        super (accountNumber, accountHolderName, accountType, balance);
        this.daysOfYear= daysOfYear;
    }
    public double calculateInterest() {
        dailyInterest = (super.getBalance() * Bank.interestRate / 100)
        / daysOfYear;
        DecimalFormat twoDForm = new DecimalFormat("#.00");
        return Double.valueOf(twoDForm.format(dailyInterest));
    }


    public void displayDetails (String accountNumber){
        super.displayDetail();
        System.out.println("Daily Interest is: $"+ calculateInterest());
        System.out.println("-----------------------------------------------");
    }
@Override
public void checkBalance(String accountNumber){
        System.out.println("----------------------------");
        System.out.println("Available balance: $" + super.getBalance());
        System.out.println("-----------------------------");
}
    @Override
    public void depositCash (String accountNum, double amount){
super.setBalance(super.getBalance() + amount);

Calendar objNow = Calendar.getInstance();
        SimpleDateFormat objFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
System.out.println("Date-Time");
    }
    @Override
    public void withdrawCash(String accountNumber, double amount){
        throw new UnsupportedOperationException("Not supported yet.");


    }

}
