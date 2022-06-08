package vn.fpt.bank;

import java.util.Date;

public class SavingAccount {
    private static final double[] SAVING_INTEREST_RATE={1,2,3,5,5,3,6.5,8.5};
    private final double MIN_START_BALANCE = 1000000000;
    private Date dateCreate;
    private double balance;
    private double interestRate;
    private double monthlyInteresrate;
    private double savingAccount;
    private int savingterm;
    private double starBalance;


    public SavingAccount() {

    }

    public SavingAccount(double interestRate, double savingAccount, int savingterm, double starBalance ) {
        this.interestRate = interestRate;
        this.savingAccount = savingAccount;
        this.savingterm = savingterm;
        this.starBalance = starBalance;

    }

  public static double getSavingInterestRate(int month){
        return SAVING_INTEREST_RATE[month/3];
  }
}
