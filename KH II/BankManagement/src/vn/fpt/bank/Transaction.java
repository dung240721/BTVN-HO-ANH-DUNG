package vn.fpt.bank;

public class Transaction {
    private String description;
    public Transaction(){

    }
    public String printTransaction(){
        return "Transaction detail";
    }
    public String getDescription(){
        return description;
    }
}
