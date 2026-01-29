package com.example.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class Overview {
//    based on the implementation of the hashmap
//    we have set hashset and treeset and enumset and all that
static void main(String[] args) {

    Set<Integer> set = new HashSet<>();
    set.add(14);
    set.add(15);
    set.add(16);
    set.add(17);
    System.out.println(set.contains(15));
    set.clear();
    for(int i : set){
        System.out.println(i);
    }

    ConcurrentSkipListSet<Integer> set1 = new ConcurrentSkipListSet<>();
}

}
