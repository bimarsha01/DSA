package com.example.OOP.singleton;

public class singleton {
    private singleton(){
//private int a = 10;
    }

    private static singleton instance;

    public static singleton getInstance(){
if(instance == null){
    singleton instance = new singleton();
}
        return instance;
    }
}
