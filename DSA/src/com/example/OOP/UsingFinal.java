package com.example.OOP;

public class UsingFinal {
    static void main(String[] args) {

        Integer a = 10;
        Integer b = 20;

        swap( a , b);

        System.out.println(" the final answer is " + a + " and " + b );
    }

    static void swap(Integer a , Integer b){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

//    here the following code will not work because the key word Integer is final meaning it cannot be modified in further use and will not change its value whatsoever.
}


class A {
//   1.  final int no ;
//   2. final int no = 10;

//    here the above 1. no will give an error since the final has to be initialized


}


//but this final thing just works and does not change the value when it is of the primitive data type