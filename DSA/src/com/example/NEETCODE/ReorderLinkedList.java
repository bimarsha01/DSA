package com.example.NEETCODE;

public class ReorderLinkedList {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {



        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        ListNode current = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode anotherHalf = slow.next;
        slow.next = null;
        ListNode previous = null;
        ListNode current2 = anotherHalf;

        while (current2 != null) {
            ListNode next = current2.next;
            current2.next = previous;
            previous = current2;
            current2 = next;
        }

         current2 = previous;

        ListNode current1 = head;

        while (current2 != null) {

            ListNode next = current1.next;
            ListNode next2 = current2.next;

            current1.next = current2;
            current2.next = next;

            current1 = next;
            current2 = next2;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}