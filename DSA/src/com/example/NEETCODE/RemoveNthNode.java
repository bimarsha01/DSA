package com.example.NEETCODE;

public class RemoveNthNode {

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
        ListNode dummy = new ListNode(0);
        dummy.next = head;


        int n = 2;

        ListNode left = dummy;
        ListNode right = dummy;


        while(n!=0){
            right = right.next;
            n = n-1;
        }
        while(right.next != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;

        head = dummy.next;
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
