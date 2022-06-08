package com.example.model;
//Custom ex thuc chat laf dung cac contructor cua class Ex
class ExCustom extends Exception{
    public ExCustom(String message){
        super(message);
    }
}
public class ExDemo{
    void checkValidate( int weight) throws ExCustom{
        if(weight < 1000){
            throw  new ExCustom("not validate");
        }

    }
    public static void main(String[] args){
ExDemo exDemo = new ExDemo();
try{
    exDemo.checkValidate(100);
}catch (ExCustom ec){
    System.out.println("Exception!!!");
    System.out.println(ec.getMessage());
}
    }
}