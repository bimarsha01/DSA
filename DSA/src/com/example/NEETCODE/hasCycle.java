package com.example.NEETCODE;

import java.util.HashSet;

public class hasCycle {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static boolean hasCycle(Node head) {
        HashSet<Node> visited = new HashSet<>();

        Node current = head;

        while(current != null){
            if(visited.contains(current)){
                return true;
            }
            else {

                visited.add(current);
                current = current.next;
            }
        }

        return false;
    }

     static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


        node4.next = node2;

        boolean result = hasCycle(node1);

        System.out.println("Cycle exists: " + result);
    }
}