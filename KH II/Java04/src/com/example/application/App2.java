package com.example.application;
import com.example.entites.Student;

import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{12,99,1,0,20,33,55,6};
        Arrays.sort(numbers,3,6);
        for (int number: numbers) {
            System.out.println("Number:" +number);
        }
        Student st = new Student();
    //    st.sayHelloStudent();

    }
}
