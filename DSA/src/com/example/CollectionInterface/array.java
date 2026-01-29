package com.example.CollectionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array {

    static void main(String[] args) {
            int[] arr = new int[10];
//            this is the static so it can only be added once and needs to be changed again and again manually:

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(5);
//        list.add(5);
//
//        System.out.println(list.getFirst());
//        System.out.println(list.size());
//        System.out.println(list.get(1));
//
//        for(int a : list){
//            System.out.println(a);
//        }
//        System.out.println(list.contains(4));
//
//        list.remove(1);
//        System.out.println(list);
//
//        list.set(1,50);
//        System.out.println(list);

        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings.getClass().getName());
        List<String> list1 = Arrays.asList("bimaarsha" , "ghimire");
        System.out.println(list1.getClass().getName());
        System.out.println(list1);

        list1.set(1 , "ghimire");
//        list1.add("hello");


//        there is another function like "addall" so that it adds more numericals

    }


}
