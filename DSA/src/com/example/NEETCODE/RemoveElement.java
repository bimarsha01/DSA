package com.example.NEETCODE;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {
    static void main() {
        int val = 3;

        int[] nums = { 3,2,3,4,5,6,3,2};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int s : nums){
        arrayList.add(s);
        }

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            if(iterator.next() == val){
                iterator.remove();
            }
        }

        int[] arr = new int[arrayList.size()];
        for(int i = 0;i<arrayList.size();i++){
            arr[i] = arrayList.get(i);
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
