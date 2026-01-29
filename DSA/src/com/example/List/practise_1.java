package com.example.List;

import java.util.ArrayList;
import java.util.List;

public class practise_1 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();

        lists.add("hello");
        lists.add("world");
        lists.add("my name");
        lists.add("is");
        lists.add("bimarsha");

        for(String all : lists){
            System.out.println(all);
        }

//        now to get the elements present in the lists we have
        System.out.println("THE FIRST ELEMENT IS : " + lists.get(1));


//        now to update the element present in the index we have
        lists.set(0,"hi");
        for(String all : lists){
            System.out.println(all);
        }

//        now to remove the element we have
        lists.remove(1);
        for(String all : lists){
            System.out.println(all);
        }

        boolean does = lists.contains("bimarsha");
        System.out.println(does);


        ArrayList<String> newList = new ArrayList<>(lists);
        newList.add("123");
        System.out.println(newList);

    }


}
