package com.example.NEETCODE;

public class OOPDispatch {

    static void main(String[] args) {
        String o = "hi";
        f(o);
    }
    static  void f(String o){
        System.out.println("String");
        StringBuilder a = new StringBuilder("A");
        StringBuilder B = new StringBuilder("B");
        a = B;
        B = null;
        System.out.println(a);

    }
    static void f(Object o){
        System.out.println("Object");
    }
}
