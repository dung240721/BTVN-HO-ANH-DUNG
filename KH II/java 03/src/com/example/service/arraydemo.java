package com.example.service;

import java.sql.SQLOutput;
public class arraydemo {
    public static void main(String[] args) {
        int[] myArray = new int[10];
String[] student = new String[]{"nam", "thao", "linh", "dung"};

for(int index = 0; index < myArray.length ; index ++){
    System.out.println(index);
}


//for-each: lập tổng 1 tập hợp các đối tượng.
        for (String name : student) {
            System.out.println(name);
        }
    }
}
