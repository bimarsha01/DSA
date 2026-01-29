package com.example.CollectionInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashedMap {
    static void main(String[] args) {
        LinkedHashMap<String , Integer> linkedHashedMap = new LinkedHashMap<>();
        HashMap<String , Integer> hashMap = new HashMap<>();
//        here the hashmap does not have any order so the value can come anytime anywhere without "consent" .
        hashMap.put("bimarsha" , 99);
        hashMap.put("anushila" , 97);
        hashMap.put("abhishek" , 96);
        hashMap.put("sandeep" , 96);


//         but here in this situation where there is like this linkedhashedmap there is the order present it is kind of the modified version of the hashmap
        linkedHashedMap.put("bimarsha" , 99);
        linkedHashedMap.put("anushila" , 97);
        linkedHashedMap.put("abhishek" , 96);
        linkedHashedMap.put("sandeep" , 96);

       for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }

       for(Map.Entry<String, Integer> entry : linkedHashedMap.entrySet()){
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }

    }
}
