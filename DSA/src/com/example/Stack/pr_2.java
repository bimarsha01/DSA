package com.example.Stack;

import java.util.Stack;

public class pr_2 {
    static void push(Stack<Integer> stack){

        for(int i =0 ;i<5;i++){
            Integer a = stack.push(i);
            System.out.println(a);
        }


    }
    static void pop(Stack<Integer> stack){

        for(int i =0 ;i<5;i++){
            Integer a = stack.pop();
            System.out.println(a);
        }

    stack.push(1);
    }
    static void peek(Stack<Integer> stack){

            Integer a = stack.peek();
            System.out.println(a);


    }

    static void search(Stack<Integer> stack , int element){
        Integer a = stack.search(element);

        if(a == -1){
            System.out.println("Element doesnot exists");
        }
        else{
            System.out.println("Element is at the position : " + a);
        }
    }


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        push(stack);
        pop(stack);
        peek(stack);
        search(stack , 2);

    }
}
