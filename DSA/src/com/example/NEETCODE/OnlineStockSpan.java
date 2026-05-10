package com.example.NEETCODE;

import java.util.Stack;

public class OnlineStockSpan {
    private Stack<int[]> stack; // you're pushing only prices

    public OnlineStockSpan() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
            if(stack.isEmpty()){
                stack.push(new int[]{price, span});
            }
            else{
                if(stack.peek()[0] <= price){
                    span = span +stack.peek()[1];
                    stack.pop();
                }
                else{
                    stack.push(new int[]{price, span});
                }
            }
            return span;
    }

     static void main(String[] args) {
        OnlineStockSpan obj = new OnlineStockSpan();

        System.out.println(obj.next(100));
        System.out.println(obj.next(80));
        System.out.println(obj.next(60));
        System.out.println(obj.next(70));
        System.out.println(obj.next(60));
        System.out.println(obj.next(75));
        System.out.println(obj.next(85));
    }
}