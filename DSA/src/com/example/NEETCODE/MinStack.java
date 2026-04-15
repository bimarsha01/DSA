package com.example.NEETCODE;

import java.util.Stack;

public class MinStack {


    Stack<Integer> stack = new Stack<>();
    static void main(String[] args) {
    MinStack stack = new MinStack();
    stack.push(4);
    stack.push(2);
    stack.push(3);

        System.out.println(stack.getMin());

        stack.pop();

        System.out.println(stack.top());
        System.out.println(stack.getMin());
    }

    public MinStack() {
        stack = new Stack<>();
    }
    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack.stream()
                .min(Integer::compare)
                .orElseThrow();
    }
}
