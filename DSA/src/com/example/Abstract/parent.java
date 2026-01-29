package com.example.Abstract;

public abstract class parent {

    int age;

    public parent(int age) {
        this.age = age;
    }

    abstract void hello();

     abstract void helloo();

     void what(){
         System.out.println("this is from the parent class ok ");
     }

//     we could create static and default method in the abstract one since java 8
}
