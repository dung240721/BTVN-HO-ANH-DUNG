package com.example.model;

public class ExThorw2 {

    static void checkMarks(float java, float sql){
        if(java <10 && sql < 10) {
            throw new ArithmeticException("Sv khong du dieu kien koc tiep ky 3");
        }else {
            System.out.print("Sv du dieu kien hoc tiep");
        }
    }

    public static void main(String[] args){
        System.out.println("he thong quan ly diem sv...");
        checkMarks(8,7);
        System.out.println("Chuong trinh kt");
    }
}
