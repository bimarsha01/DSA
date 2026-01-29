package com.example.Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    static void main(String[] args) {
//        there is an array in the enum map and with the size as same as enum here it is 7
        Map<day , String> map = new EnumMap<>(day.class);
        map.put(day.tuesday , "series");
        System.out.println(day.tuesday.ordinal());

    }
    enum day {
        sunday , monday , tuesday , wednesday , thursday , friday , saturday
    }
}

