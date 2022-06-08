package com.example.entity;

public class personClient {
    public static void main(String[] args){
    //oop: Tạo ra một odject, nhấc object ra khỏi class, đặt nó vào một class khác mà nó vẫn chạy được.
    person p1 = new person();//p1 chỉ có đối tượng chưa có gtri thuộc tính
        p1.setName("Dung");
    person t2108a1 = new person("T2108A1 Fpt-Aptech",2021);//có gtri thuộc tính thiếu place
    person p2 = new person("Fpt", 1989, "Hanoi");//đủ các thuộc tính
 System.out.println("Name of p1:" + p1.getName());
        System.out.println("Name of t2108a1:" + t2108a1.getName());
        System.out.println("place of t2108a1:" + t2108a1.getName());
        System.out.println("place of 2:" + p1.getPlace());
        System.out.println("Call method: " + p1.sayHello());
        System.out.println("Call method: " + p2.sayHello());
        System.out.println("Call method: " + t2108a1.sayHello());
p1.sayHello();


    }

}
