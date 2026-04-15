package com.example.NEETCODE;

import java.util.*;

public class SlidingWindowMaximum {
    static void main(String[] args) {
        int[] arr = { 1,2,1,0,4,2,6};
        int k = 3;
        int[] finalOp = countWindowMaximum(arr , k);
        System.out.println(Arrays.toString(finalOp));
    }
    public static int[] countWindowMaximum(int[] arr , int k){
        Deque<Integer> dq = new ArrayDeque<>();
        int[] res = new int[arr.length - k + 1];
        int idx = 0;

        for(int i = 0; i < arr.length; i++) {

            while(!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i >= k - 1) {
                res[idx++] = arr[dq.peekFirst()];
            }
        }

        return res;
    }

}
