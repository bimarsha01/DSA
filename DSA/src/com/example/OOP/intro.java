package com.example.OOP;

import java.util.Arrays;

public class intro {
    public static void main(String[] args) {
//        store 5 roll

        int[] roll = new int[5];


        String[] names = new String[5];

//        now if you want to create a student info like roll and name and marks then we use object:

//        now the object helps to make it easier

//        A class is a named group of properties and functions

//         creating the own datatype is done by classes:
//

        Student[] stud  = new Student[5];

        Student stud1;
//        System.out.println(Arrays.toString(stud)); garbage value

        stud1 = new Student();

        stud1.rollNo = 18;
        stud1.name = "bimarsha";
        stud1.marks = 88.4F;
//        System.out.println(stud1);  garbage value;
        System.out.println(stud1.rollNo); // by default the primitives is 0 and String is null
    }

}

class Student {
    int rollNo;
    String name;
    float marks;
}

//objects are stored in heap memory
//and the reference variable is stored in the stack memory


//instance variable : variable inside the object.


// the new keyword is responsible for dynamically allocates the memory and returns a reference variable:


//A constructor generally defines what happens when we create the object of it :

