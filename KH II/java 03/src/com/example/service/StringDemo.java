package com.example.service;

import com.example.authetic.UerLogin;

public class StringDemo {
    public static void main(String[] args) {
String str1= "one";
String str2 = "two";
String str3 = "three";


String s = str1.concat(str2);
System.out.println("str1.concat(str2): " + s);

        UerLogin userLogin = new UerLogin();
        boolean status = userLogin.checkLogin("admin","12345");
        if(status){
            System.out.println("Login success");

        }else {
            System.out.println("fail login!!");
        }
    }
}
