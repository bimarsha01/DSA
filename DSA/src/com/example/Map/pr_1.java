package com.example.Map;

import java.util.HashMap;
import java.util.Map;

public class pr_1 {
    public static void main(String[] args) {
        Map<String , Integer> mp = new HashMap<>();

        mp.put("a" , 100);
        mp.put("b" , 100);
        mp.put("c" , 100);
        mp.put("a" , 100);
        mp.put("b" , 100);
        System.out.println(mp);


    }
}
