package com.example.service;

import java.util.Arrays;
public class Arraydemmo2 {
    public static void main(String[] args) {
        int[] classes = new int[]{2108,2110,2111};
//sort sắp xếp
Arrays.sort(classes);
//print
        for (int class1: classes) {
            System.out.println("Classes at Fpt T: " + class1+"A1");
        }
        String classString = Arrays.toString(classes);
        System.out.printf("Classes: " +classString);
}}

