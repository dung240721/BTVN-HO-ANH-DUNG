package vn.fpt.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BankMethod {
    public static Date parseDate(String data)  {
   try{
       return new SimpleDateFormat("HH:mm:ss dd-MM-yyyy").parse(data);
    }catch(ParseException e) {
       return null;
   }
}
}
