package com.example.generics;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdaFunctions {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<5;i++){
            list.add(i+1);
        }
        for(int i :list){
            System.out.println(i)  ;
        }
        list.forEach((item) -> {
            if(item %2 ==0){
                System.out.println(item);
            }
        });

        Consumer<Integer> fun = System.out::println;
        list.forEach(fun);
        Operations sum = (a , b) -> a+b;
        Operations prod = (a , b) -> a*b;
        Operations diff = (a , b) -> a-b;


        lambdaFunctions functions = new lambdaFunctions();
        functions.op(5,3,sum);
    }
   private int op(int a , int b , Operations op){
        return op.operation(a,b);
   }
}

interface  Operations{
     int operation(int a, int b);


}


