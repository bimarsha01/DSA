package com.example.NEETCODE;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    static void main(String[] args) {

        int[] arr = {1,2,3,4,1,2};
        int k = 2;

        int[] finalAnswer = topKFrequent(arr , k);

        for(int i : finalAnswer){
            System.out.println(i);
        }
    }

    public static int[] topKFrequent(int[] arr , int k){
        HashMap<Integer , Integer> topk = new HashMap<>();

        for(int keys : arr){
            topk.put(keys , topk.getOrDefault(keys , 0) +1);
        }
        PriorityQueue<Map.Entry<Integer , Integer>>heap = new PriorityQueue<>((a,b)->a.getValue() - b.getValue());
        for(Map.Entry<Integer , Integer> entry : topk.entrySet()){
            heap.offer(entry);

            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] res = new int[k];
        int index = 0;

        while(!heap.isEmpty()){
            res[index++] = heap.poll().getKey();

        }
        return res;
    }
}


//class Solution {
//    public boolean isValidSudoku(char[][] board) {
//        Set<Character> seen = new HashSet<>();
//        for (int i = 0; i < 9; i++) {
//            seen.clear();
//            for (int j = 0; j < 9; j++) {
//                if (board[i][j] != '.') {
//                    if (seen.contains(board[i][j])) {
//                        return false;
//                    }
//                } else {
//                    seen.add(board[i][j]);
//                }
//            }
//        }
//
//        for (int i = 0; i < 9; i++) {
//            seen.clear();
//            for (int j = 0; j < 9; j++) {
//                if (board[j][i] != '.') {
//                    if (seen.contains(board[j][i])) {
//                        return false;
//                    }
//                } else {
//                    seen.add(board[j][i]);
//                }
//            }
//        }
//
//        for (int boxrow = 0; boxrow < 9; boxrow += 3) {
//            for (int boxcol = 0; boxcol < 9; boxcol += 3) {
//                seen.clear();
//                for (int i = 0; i < 3; i++) {
//                    for (int j = 0; j < 3; j++) {
//                        if (seen.contains(board[i][j]) && board[i][j] != '.') {
//                            return false;
//                        } else {
//                            seen.add(board[i][j]);
//                        }
//                    }
//                }
//            }
//        }
//        return true;
//    }
//}
//
