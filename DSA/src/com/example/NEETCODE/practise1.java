package com.example.NEETCODE;

import java.util.*;

public class practise1 {
    static void main(String[] args) {
//        Map<User, String> map = new HashMap<>();
//
//        User u1 = new User(1, "Alex");
//
//        map.put(u1, "Developer");
//
//        System.out.println(map.get(u1));
//
//        u1.setId(2);
//        System.out.println(map.get(u1));

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.removeIf(n -> n == 20);
//        this is done since I cannot modify the arraylist when it is in the loop and either I do this or use the iterator inbuilt remove thing using loop.

//        well this is the other way using the iterator since the advanced for each loop also uses this thing behind the scene and with the help of this we could actually remove the 20 from the arraylist


//        Iterator<Integer> iterator = numbers.iterator();

//        while (iterator.hasNext()) {
//            Integer n = iterator.next();
//
//            if (n == 20) {
//                iterator.remove();
//            }
//        }

        for(Integer integer : numbers){
            System.out.println(integer);
        }
    Integer a = 127;
    Integer b = 127;
    Integer c = 128;
    Integer d = 128;

        System.out.println(a==b);
        System.out.println(c==d);

        List<String> names = new ArrayList<>();
        names.add("bimarsha");
        names.add("ghimire");
        names.add("don");

        for(String name: names){
            if(name == "ghimire"){
                names.remove(name);
            }
        }

        for(String name1 : names){
            System.out.println(name1);
        }
    }




}
