package com.example.Hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdendityHashmapDemo {
    static void main(String[] args) {
        String key = new String("key");
        String key2 = new String("key");

        Map<String , Integer> hashMap = new IdentityHashMap<>();
        hashMap.put(key,1);
        hashMap.put(key2,2);
        System.out.println(hashMap);
    }
}
