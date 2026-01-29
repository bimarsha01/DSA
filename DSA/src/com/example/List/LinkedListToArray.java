package com.example.List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class LinkedListToArray {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");

        System.out.println("Adding using linked list: " + linkedList);

        Object[] a = linkedList.toArray();

        for(Object all : a){
            System.out.println("With array : " + all);
        }

    }
}
