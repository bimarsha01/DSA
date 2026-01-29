package com.example.Set;

import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Set;

public class treeSet_pr {
    public static void main(String[] args) {
       Set<String> ts = new TreeSet<>();
       ts.add("bimarsha");
       ts.add("amarsha");
       ts.add("ghimire");
       ts.add("ehimire");

        System.out.println("they are: " + ts);


        System.out.println("The first element is : " + ts.stream().findFirst());

        NavigableSet<String> ts2 = new TreeSet<>();
        ts2.add("bimarsha");
        ts2.add("amarsha");
        ts2.add("ghimire");
        ts2.add("ehimire");

        System.out.println("they are: " + ts);


        System.out.println("The first element is : " + ts2.first());
    }
}
