package com.example.NEETCODE;

import java.util.HashMap;

public class LRUCache {

    static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    HashMap<Integer , Node> hashMap;
    Node LRU;
    Node MRU;
    Node next;
    Node head;
    public LRUCache(int capacity) {
        hashMap = new HashMap<>(capacity);
        LRU.value = -1;
        MRU.value = -1;

        LRU.next = MRU;
        MRU.prev = LRU;
        head = LRU.next;
    }

    public int get(int key) {
        if (!hashMap.containsKey(key)) {
            return -1;
        }

        return -1;
    }

    public void put(int key, int value) {

        Node newNode = new Node(key, value);
        addNode(newNode);
    }

    public void addNode(Node newNode){
        next = head.next;
        head.next = newNode;
        newNode.prev = head;
        MRU.prev = newNode;
        newNode.next = MRU;
    }

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        System.out.println(cache.get(1));

        cache.put(3, 3);

        System.out.println(cache.get(2));

        cache.put(4, 4);

        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}