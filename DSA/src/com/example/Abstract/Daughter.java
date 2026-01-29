package com.example.Abstract;

public class Daughter extends parent {


    public Daughter(int age) {
        super(age);
    }

    @Override
    void hello() {
        System.out.println("what are you doing");
    }

    @Override
    void helloo() {
        System.out.println("hello this is me doing nothing");
    }
}
