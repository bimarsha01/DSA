package com.example.OOP;

import java.util.Arrays;

public class constructor {

    static void main() {

        Students[] students = new Students[5];

        Students stud1 = new Students(101 , "bimarshaaa" , 90.3f);

        Students stud2 = new Students();


//        here stud3 is not creating any object instead it is also pointing to the object of the student2
//         and that is going to be in the heap memory since it is an object
//        remember the  primitives are stored in the stack and not in the heap since the primitives are not objects


        Students stud3 = stud2;
        System.out.println(stud3.name);

        stud3.name = "bimarsha";

        System.out.println(stud2.name);
        System.out.println(stud3.name);

//        affects the both of the objects since it is pointing to the same



//here we are using the copy constructor where random is copying of the stud1's objects :)

        Students random = new Students(stud1);
        System.out.println(random.name);

        stud1.grettings();



    }
}
class Students{
    int rollNo;
    String name ;
    float marks;

    void grettings(){
        System.out.println("hello i am " + name);
    }

    public Students() {
//        this.name = "bimarsha";
//        this.rollNo = 17;
//        this.marks = 5835.3f;

//        now this is generally making a constructor without doing all the stuffs above and directly implementing it

        this(17 , "jellooo " , 244f);

    }

    //    now this is called function overloading or also constructor overloading here when you call the empty
//    constructor then this comes into play and when you have like these bunch of parameters then the above one comes into play


    public Students(int rollNo , String name , float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;

    }


//    this is the copy constructor and copies all the information of one's object to the other
    Students (Students other){
         this.name  = other.name;
         this.marks = other.marks;
         this.rollNo = other.rollNo;
    }



}
