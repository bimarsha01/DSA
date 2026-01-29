package com.example.Lambda;

interface Calculator{
    int subs(int a , int b);
}

public class pr_2
{

    public static void main(String[] args) {
        Calculator calculator = (a , b) -> {
            if(a<b){
                throw new RuntimeException();
            }
            else{
                return a -b;
            }

        };

        System.out.println(calculator.subs(20,10));

    }
}
