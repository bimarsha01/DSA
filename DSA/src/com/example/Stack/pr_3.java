package com.example.Stack;

import java.util.*;
import java.util.stream.Collectors;

public class pr_3 {

    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Deque<Integer> de1 = new ArrayDeque<>();


        st1.push(1);
        de1.push(1);
        st1.push(2);
        de1.push(2);
        st1.push(1);
        st1.push(3);

        List<Integer> l1 = st1.stream().collect(Collectors.toList());
        System.out.println("Using stack");
        for(int i =0;i<l1.size();i++){
            System.out.println(l1.get(i));

        }List<Integer> d1 = de1.stream().collect(Collectors.toList());
        System.out.println("Using dequeue");
        for(int i =0;i<d1.size();i++){
            System.out.println(d1.get(i));
        }

        HashSet<Integer> h1 = new HashSet<>(st1);
        System.out.println(h1);


    }
}
