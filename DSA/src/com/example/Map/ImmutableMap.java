package com.example.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
    static void main(String[] args) {
//        this one that cannot be changed or updated or not anything
        Map<String , Integer> map = new HashMap<>();
        map.put("bimarsha" , 1);
        map.put("bimarshaa" , 2);
        Map<String  , Integer> map2 = Collections.unmodifiableMap(map);
//        map2.put("bimarsha" , 3); will throw an error since we are putting the value where it is not allowed.
//        now we could put the values in the map 1 also so that does not make any sense for that we do:

        Map<String , Integer> map3 = Map.of("bimarsha" , 99 , "bimarshaa" , 98);
//        here we are using this Map.of method or something to prevent others from modifying the map we cound not modify it
//        map3.put("whattt", 98); ---> will throw an error

//        again there is problem in this Map.of we could only put 10 values no more than that to put more than 10 values we need to use:
        Map.ofEntries(Map.entry("bimarsha" , 99) , Map.entry("bimarshaa" , 99));

    }
}
