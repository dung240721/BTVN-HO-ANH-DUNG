package com.example.application;

import java.lang.StringBuilder;

public class App3 {
    public static void main(String[] args) {
      StringBuilder StringBuider = new StringBuilder(20);

      StringBuider.append("Hello T2108A1");

char ch = '!';
StringBuider.append(ch);
System.out.println(StringBuider);

StringBuider.insert(13,"fpt Aptech");
System.out.println(StringBuider);


StringBuider.delete(6,9);
System.out.println(StringBuider);
    }
}
