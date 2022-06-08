package vn.fpt.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class CurrenAccount extends Account {
    private ArrayList<SavingAccount> SavingAccount;
    private ArrayList<LoanAccount> LoanAccount; //một danh sách các đối tượng vay được tạo trong CurenAccountt
private ArrayList<Transaction> transactions;
private double balance;
private final double MIN_BALANCE = 50000;
private double interrestRate;


    public CurrenAccount() {
    }

    public CurrenAccount(String customerName, String id) {
        super(customerName, id);
        this.balance = MIN_BALANCE;
        this.transactions = new ArrayList<>();
        this.SavingAccount = new ArrayList<>();
        this.LoanAccount = new ArrayList<>();
    }

    public static CurrenAccount createAccount(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your id: ");
        String id = input.nextLine();
        return new CurrenAccount(id,name);
    }

public SavingAccount createSavingAccount1(){
        double startBalance= 0;
        int savingTerm= 0;
        double interestRate = 0;
        double savingAmount = 0;
         return new SavingAccount(interestRate,savingAmount, savingTerm, startBalance);

}





    public CurrenAccount(ArrayList<vn.fpt.bank.SavingAccount> savingAccount) {
        SavingAccount = savingAccount;
    }

    public ArrayList<vn.fpt.bank.SavingAccount> getSavingAccount() {
        return SavingAccount;
    }

    public void setSavingAccount(ArrayList<vn.fpt.bank.SavingAccount> savingAccount) {
        SavingAccount = savingAccount;
    }

    public ArrayList<vn.fpt.bank.LoanAccount> getLoanAccount() {
        return LoanAccount;
    }

    public void setLoanAccount(ArrayList<vn.fpt.bank.LoanAccount> loanAccount) {
        LoanAccount = loanAccount;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMIN_BALANCE() {
        return MIN_BALANCE;
    }

    public double getInterrestRate() {
        return interrestRate;
    }

    public void setInterrestRate(double interrestRate) {
        this.interrestRate = interrestRate;
    }

    public void withDraw(){

    }

    public  void deposit(){

    }
    public boolean createSavingAccount()
    {
        return true;
    }
    public boolean createBooleanAccount(){
        return true;
    }
    public void printtCard(){

    }
    public String isActive(){
       return "Active";
    }
}
