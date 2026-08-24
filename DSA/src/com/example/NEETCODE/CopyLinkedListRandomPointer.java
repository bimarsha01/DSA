package com.example.NEETCODE;

import java.util.HashMap;

public class CopyLinkedListRandomPointer {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(3);
        head.next = new Node(7);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        head.random = null;
        head.next.random = head.next.next.next;
        head.next.next.random = head;
        head.next.next.next.random = head.next;

        Node newHead = copyRandomList(head);

        Node current = newHead;

        while (current != null) {

            System.out.print("Value: " + current.val);

            if (current.random != null) {
                System.out.println(", Random: " + current.random.val);
            } else {
                System.out.println(", Random: null");
            }

            current = current.next;
        }
    }

    public static Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        HashMap<Node, Node> hashMap = new HashMap<>();

        Node oldTemp = head;
        Node newHead = new Node(head.val);
        Node newTemp = newHead;

        hashMap.put(oldTemp, newHead);
        oldTemp = head.next;

        while (oldTemp != null) {

            Node copyNode = new Node(oldTemp.val);

            hashMap.put(oldTemp, copyNode);

            newTemp.next = copyNode;
            newTemp = newTemp.next;

            oldTemp = oldTemp.next;
        }
        oldTemp = head;
        newTemp = newHead;

        while (oldTemp != null) {

            if (oldTemp.random != null) {
                newTemp.random = hashMap.get(oldTemp.random);
            } else {
                newTemp.random = null;
            }

            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }

        return newHead;
    }
}