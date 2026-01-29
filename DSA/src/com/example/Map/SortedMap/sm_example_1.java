package com.example.Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class sm_example_1 {
    static void main(String[] args) {
        SortedMap<String , Integer> sortedMap = new TreeMap<>();
        sortedMap.put("bimarsha" , 98);
        sortedMap.put("anushila" , 99);
        sortedMap.put("abhishek" , 100);
        System.out.println(sortedMap);

//        here sorted map is the interface and under it, we have all of the treemap and also navigable map so that we could implement it
//    the sorted map also extends the map and also the entries are sorted on the basis of keys unlike

//        we also have other functionality also in this sorted map so that i could do all other stuffs like

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap("anushila"));
        System.out.println(sortedMap.tailMap("anushila"));
    }

}
