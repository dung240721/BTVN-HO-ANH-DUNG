package com.example.authetic;

public class UerLogin {
    //public gọi ở đâu cũng được
    //private gọi trong cùng một class
//protected gọi trong cùng một packet


   public boolean checkLogin(String username,String password){
        if (username.equals(password)){
            return true;
        }
        return false;
    }
}
