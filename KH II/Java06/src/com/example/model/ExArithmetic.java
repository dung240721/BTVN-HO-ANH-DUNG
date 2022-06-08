package com.example.model;

import java.net.ConnectException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.EmptyStackException;

public class ExArithmetic {
    public static void main(String[] args){

        Person person = null;
       try {
        //   ConnectException cnn = DriverManager.getConnection()
           String name = person.name;
           int result = 100/0;
           System.out.println(result);
       }
       catch (ArrayIndexOutOfBoundsException e1){
           System.out.println("Vuot qua kich thuoc cua mang");
       }catch (EmptyStackException e3){
           System.out.println("Memoty errors");
       }catch (ArithmeticException e4){
           System.out.println("Khong duoc chia mot so cho zero");

       }

       catch (Exception e_final){
           System.out.println("Loi roi");
       }


    }
}
class Person{
    public String name;
    public Person(){

    }
}
