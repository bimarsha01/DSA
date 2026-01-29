package com.example.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class pr_1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(15);

        System.out.println( queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue);
    }
}
