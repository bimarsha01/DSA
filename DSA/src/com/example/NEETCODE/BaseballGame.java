package com.example.NEETCODE;

import java.util.Stack;

public class BaseballGame {
    static void main(String[] args) {
        String[] arr = {"1","2","+","C","5","D"};
        int finalOp = countTheStack(arr);
        System.out.println(finalOp);
    }
    public static int countTheStack(String[] arr){
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        int count = 0;
        while(i < arr.length){
           if(arr[i].equals("+")){
               int a = Integer.parseInt(arr[i-1]);
               int b =  Integer.parseInt(arr[i-2]);
               stack.push(a+b);
               count = count + a + b;
               i++;
           }
           else if(arr[i].equals("C")){
            int c = stack.pop();
            count = count - c;
               i++;
           }
           else if(arr[i].equals("D")){
               int d = Integer.parseInt(arr[i-1]);
               count = count + 2*d;
               i++;
           }
           else {
               stack.push(Integer.parseInt(arr[i]));
               count = count +  Integer.parseInt(arr[i]);
               i++;
           }

            }
        return count;
        }
    }
