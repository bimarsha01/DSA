package com.example.NEETCODE;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

        Queue<Integer> q;

        public ImplementStackUsingQueues() {
            q = new LinkedList<>();
        }

        public void push(int x) {
            q.offer(x);

            int size = q.size();
            for (int i = 0; i < size - 1; i++) {
                q.offer(q.poll());
            }
        }

        public int pop() {
            return q.poll();
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }

         static void main(String[] args) {

            ImplementStackUsingQueues obj = new ImplementStackUsingQueues();

            obj.push(1);
            obj.push(2);
            obj.push(3);

            System.out.println("Top: " + obj.top());
            System.out.println("Pop: " + obj.pop());
            System.out.println("Top: " + obj.top());
            System.out.println("Empty: " + obj.empty());

            obj.pop();
            obj.pop();

            System.out.println("Empty after removing all: " + obj.empty());
        }
    }

