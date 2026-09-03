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
        }
    }

    HashMap<Integer, Node> hashMap;

    Node LRU;
    Node MRU;

    int limit;

    public LRUCache(int capacity) {

        limit = capacity;

        hashMap = new HashMap<>();

        LRU = new Node(-1, -1);
        MRU = new Node(-1, -1);

        LRU.next = MRU;
        MRU.prev = LRU;
    }

    public int get(int key) {

        if (!hashMap.containsKey(key)) {
            return -1;
        }

        Node current = hashMap.get(key);

        // This node was just used,
        // so move it to MRU.
        delNode(current);
        addNode(current);

        return current.value;
    }

    public void put(int key, int value) {

        // If key already exists,
        // remove its old node first.
        if (hashMap.containsKey(key)) {

            Node oldNode = hashMap.get(key);

            delNode(oldNode);
            hashMap.remove(key);
        }

        // If cache is full,
        // remove the least recently used node.
        if (hashMap.size() == limit) {

            Node leastRecentlyUsed = LRU.next;

            delNode(leastRecentlyUsed);
            hashMap.remove(leastRecentlyUsed.key);
        }

        Node newNode = new Node(key, value);

        addNode(newNode);
        hashMap.put(key, newNode);
    }

    public void addNode(Node newNode) {

        Node previous = MRU.prev;

        previous.next = newNode;
        newNode.prev = previous;

        newNode.next = MRU;
        MRU.prev = newNode;
    }

    public void delNode(Node delNode) {

        Node previous = delNode.prev;
        Node next = delNode.next;

        previous.next = next;
        next.prev = previous;
    }

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        System.out.println(cache.get(1)); // 1

        cache.put(3, 3);

        System.out.println(cache.get(2)); // -1

        cache.put(4, 4);

        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 3
        System.out.println(cache.get(4)); // 4
    }
}