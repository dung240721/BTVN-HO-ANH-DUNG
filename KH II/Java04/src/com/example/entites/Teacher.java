package com.example.entites;

import com.example.application.Message;
import com.example.application.manage;
import org.codehaus.groovy.control.Janitor;

import java.io.PrintWriter;

public class Teacher extends Person implements manage, Message {
 public Teacher(){

 }



 public Teacher(String name){
     super(name);
 }

    private void setMarks(){

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
}
