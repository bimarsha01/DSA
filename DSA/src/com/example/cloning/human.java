package com.example.cloning;

public class human implements Cloneable{
    int age;
    String name;

    public human(int age, String name) {
        this.age = age;
        this.name = name;

    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
