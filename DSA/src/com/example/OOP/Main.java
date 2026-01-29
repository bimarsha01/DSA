package com.example.OOP;

public class Main {
    static void main(String[] args) {
        UsingStatic bimarsha = new UsingStatic(22,"bimarsha" , 6 , 10220110 , false);
        UsingStatic bimshu = new UsingStatic(22,"bimarsha" , 6 , 10220110 , false);

        System.out.println(bimarsha.population);
        System.out.println(bimshu.population);

//        greeting();

//        inside the static method you cannot call anything that is non-static.
    }

//    something that is not static belongs to object


    static void hello(){
//        greeting();


        Main main = new Main();
        main.greeting();
    }
    void greeting(){
        System.out.println("heio");
    }
}
