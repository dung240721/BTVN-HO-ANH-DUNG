package com.example.service;

import java.util.Locale;

public class IndexDemo {

    public static void main(String[] args) {
        String str = "This is text demo. Is is is is";
        // tim vi tri xuat hien cur ky tu
        //VT 3 tim thay dau tien trong chuoi


        int idx = str.indexOf('s');
        System.out.println("indexOf('s'): " + idx);

         idx = str.indexOf("is");
        System.out.println("indexOf('is'): " + idx);

        //Thay the voi replace
        String str2 = str.replace('I','A');
        System.out.println("Str2: "+ str2);

        String str3 = str.replace("Is","");
        System.out.println("Str3: "+ str3);
        String str4 = str.toUpperCase();
        System.out.println("upper case :"+ str4);
    }

}
