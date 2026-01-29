package com.example.OOP;

public class UsingStatic {


    int age;
     String name;
     int height;
     int salary;
     boolean ismarried;
     static long population;

    public UsingStatic(int age, String name, int height, int salary, boolean ismarried) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.salary = salary;
        this.ismarried = ismarried;
        UsingStatic.population += 1;

//        here we did not use the keyword since this just does not belong to the object like the specific object, but it is a single common variable for the class
//        here human class is created as UsingStatic, and then we have objects, and now we input the names and all that now
//         since the population is static so it is not like added or becomes 1 to everyone, but it is just updated.
    }


}
