package com.example.OOP.accessControl;

public class main {
    static void main() {
        A obj = new A(5 , "BIMARSHA");

        System.out.println(obj.getName());

        String name = "bimarshaa";

        obj.setName(name);

        System.out.println(obj.getName());
    }
}


