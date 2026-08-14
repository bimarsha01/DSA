package com.example.NEETCODE;

import java.util.Map;
import java.util.TreeMap;

public class TimeMap {

    private Map<String, TreeMap<Integer, String>> m;

    public TimeMap() {
        m = new TreeMap<>();
    }

    public void set(String key, String value, int timestamp) {
        m.putIfAbsent(key, new TreeMap<>());
        m.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {

        if(!m.containsKey(key)){
        return "";
        }
        TreeMap<Integer , String> timeMap = m.get(key);
        Integer time = timeMap.floorKey(timestamp);
        if (time == null) {
            return "";
        }
        return timeMap.get(time);
    }

    public static void main(String[] args) {

        TimeMap timeMap = new TimeMap();

        timeMap.set("foo", "bar", 1);

        System.out.println(timeMap.get("foo", 1));
        System.out.println(timeMap.get("foo", 3));

        timeMap.set("foo", "bar2", 4);

        System.out.println(timeMap.get("foo", 4));
        System.out.println(timeMap.get("foo", 5));
        System.out.println(timeMap.get("foo", 0));
    }
}