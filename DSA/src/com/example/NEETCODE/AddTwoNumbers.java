package com.example.NEETCODE;

public class AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        int carry = 0;
        int sum;

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        while(l1 != null || l2 != null){

           int val1 = 0;
           int val2 = 0;

            if (l1 != null) {
                val1 = l1.val;
            }
            if(l2 != null) {
                val2 = l2.val;
            }
                sum = val1 + val2 + carry;
                if(sum >= 10){
                    dummy.next = new ListNode(sum % 10);
                    carry = sum /10;
                }
                else{
                    dummy.next = new ListNode(sum);
                    carry = 0;
                }

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
                dummy = dummy.next;
        }
            if(carry != 0){
                dummy.next = new ListNode(carry);
            }

        return head.next;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
//        l1.next.next.next = new ListNode(9);
//        l1.next.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);

        ListNode current = result;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}