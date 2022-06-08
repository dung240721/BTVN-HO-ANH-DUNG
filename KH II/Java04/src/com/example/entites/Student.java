package com.example.entites;

import com.example.application.Message;
import com.example.application.manage;

public class Student extends Person implements manage, Message {

    private String name;
    public Student(String name) {
        this.name = name;
    }
    public Student(){
        this.name="Anh";

    }
    public void getMarks(){

    }
    public Student(String name, String name1){
        super(name);
        this.name= name1;
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void findByName(String name) {

    }

    @Override
    public void findById(int id) {

    }

    @Override
    public void greetingMessage(String message) {

    }


    //protected void sayHelloStudent(){

   // }
}
