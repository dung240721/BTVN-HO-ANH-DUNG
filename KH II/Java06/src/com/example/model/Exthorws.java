package com.example.model;

public class Exthorws {

    int division (int a, int b) throws ArithmeticException, NullPointerException,NumberFormatException{
       int result = a/b;
      return  result;


        }
        public  static void main(String[] args){
        Exthorws exthorws = new Exthorws();
        try{
            exthorws.division(100,0);
        }catch (ArithmeticException e){
            System.out.println("khong duoc chia cho zero")
            ;
        }
        }
    }

