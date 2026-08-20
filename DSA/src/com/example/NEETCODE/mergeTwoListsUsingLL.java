package com.example.NEETCODE;

public class mergeTwoListsUsingLL {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // Your method
    public static Node mergeTwoLists(Node list1, Node list2) {

        Node dummy = new Node(-1);
        Node current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void printList(Node head) {

        Node current = head;

        while (current != null) {
            System.out.print(current.val + " → ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(5);

        System.out.println("List 1:");
        printList(list1);

        System.out.println("List 2:");
        printList(list2);

        Node mergedList = mergeTwoLists(list1, list2);

        System.out.println("Merged List:");
        printList(mergedList);
    }

}
