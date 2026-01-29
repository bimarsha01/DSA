package com.example.OOP;

public class UsingStatic2 {
    static int a = 4;
    static int b ;


//    it will just run once when the object is created and when the class is loaded  for the first time
    static{
        System.out.println("this is the static block");
         b = a*5;
    }

    static void main() {
        UsingStatic2 obj = new UsingStatic2();
        System.out.println(UsingStatic2.a + " " + UsingStatic2.b);
        UsingStatic2.b +=3;
        UsingStatic2 obj2 = new UsingStatic2();
        System.out.println(UsingStatic2.a + " " + UsingStatic2.b);
    }
}
