package com.example.cloning;

public class main {
    static void main(String[] args) throws CloneNotSupportedException{
        human humans = new human(20 , "bimarsha");
//        human twin = new human(humans);
    human twin = (human)humans.clone(); 
        System.out.println(twin.age);
        System.out.println(twin.name);
    }

}
