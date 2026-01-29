package com.example.Map;

import java.util.HashMap;
import java.util.Map;

public class pr_2 {

    public static void main(String[] args) {
        HashMap<String , Integer> hashMap = new HashMap<>();

        hashMap.put("bimarsha" , 10);
        hashMap.put("bimarshag" , 7);
        hashMap.put("bimarshaghi" , 2);

        for (Map.Entry<String, Integer> e : hashMap.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
    }
}
