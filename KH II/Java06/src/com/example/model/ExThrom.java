package com.example.model;

public class ExThrom {
    public static void myMethod(){
        try{
            throw new NullPointerException("test");//chu dong nem ra ngoai le
        }catch(NullPointerException e){
            System.out.println(e);
            throw e;
        }
    }
    public static  void main(String[] args){
        try {
            myMethod();
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
