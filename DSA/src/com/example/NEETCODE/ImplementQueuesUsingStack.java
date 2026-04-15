package com.example.NEETCODE;

import java.util.Stack;

public class ImplementQueuesUsingStack {
    Stack<Integer> stack;
    Stack<Integer> stack2;
    static void main(String[] args) {
        ImplementQueuesUsingStack obj = new ImplementQueuesUsingStack();

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.pop();
        obj.pop();

        System.out.println("Top: " + obj.peek());
        System.out.println("Pop: " + obj.pop());
        System.out.println("Top: " + obj.peek());
        System.out.println("Empty: " + obj.empty());


        System.out.println("Empty after removing all: " + obj.empty());
    }
    public ImplementQueuesUsingStack() {
        stack =  new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {

        stack.push(x);
    }

    public int pop() {
        int size = stack.size();

        if (stack2.empty()) {
            for (int i = 0; i <= size - 1; i++) {
                stack2.push(stack.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        int size = stack.size();

        if (stack2.empty()) {
            for (int i = 0; i < size ; i++) {
                stack2.push(stack.pop());
            }
        }

        return stack2.peek();
    }

    public boolean empty() {
        return stack.isEmpty() && stack2.isEmpty();
    }


}
