package com.example.model;

public class ExArray {
   public static void main(String[] args){
       try{
           try{
               int num =100/0;
           }catch (NullPointerException e1){
               System.out.println(e1);
           }
           try{
               int array[] = new int[10];
               array[10]=100;
           }catch (ArithmeticException e2){
               System.out.println(e2);
           }
       }catch(Exception e2){
   }
}}
