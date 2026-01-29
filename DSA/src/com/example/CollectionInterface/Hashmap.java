package com.example.CollectionInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

    static void main() {
        HashMap<Integer , String > map = new HashMap();
        map.put(1,"bimarsha");
        map.put(2,"bimarsha");

        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.containsKey(5));

        Set<Integer> integers = map.keySet();
        for(int i :integers){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();


        for(Map.Entry<Integer, String> entry :entries){
            System.out.println(entry.getKey() + ": " + entry.getValue());

            entry.setValue(entry.getValue().toUpperCase());


        }
        System.out.println(map);

        map.remove(2);
        System.out.println(map);



    }
}
