package com.example.NEETCODE;

public class ReverseLinkedListII {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode beforeLeft = dummy;
        for (int i = 1; i < left; i++) {
            beforeLeft = beforeLeft.next;
        }

        ListNode current = beforeLeft.next;
        ListNode prev = null;

        for (int i = left; i <= right; i++) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        beforeLeft.next.next = current;
        beforeLeft.next = prev;

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int left = 2;
        int right = 4;

        ListNode result = reverseBetween(head, left, right);

        ListNode current = result;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}