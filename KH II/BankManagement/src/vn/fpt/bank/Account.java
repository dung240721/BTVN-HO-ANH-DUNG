package vn.fpt.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Account {
    private String id;
    private String customerName;
    private Date dateCreated;
 //   private Date dataUpdate;
    static  final  String CURRENCY ="VND";
    private  String accountNumber;
    public Account() {
this.id="";
this.customerName="";
this.accountNumber   = "";

this.dateCreated = BankMethod.parseDate("16:06:20 14-3-2022");
    }

    public Account(String customerName, String id) {
        this.customerName = customerName.toUpperCase(Locale.ROOT);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


}
