package com.example.NEETCODE;

import java.util.*;

public class LongestSequence {

    static void main(String[] args) {

        int[] nums = {2,20,4,10,3,4,5};
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i : nums){
            hashSet.add(i);

        }
        List<Integer> list = new ArrayList<>(hashSet);
        hashSet.clear();
        System.out.println(list.size());

        Collections.sort(list);
        int count = 1;
        for(int i = 0;i<list.size();i++){
            if (list.get(i)+ 1 == list.get(i)) {
                count = count + 1;
            }else {
                hashSet.add(count);
                count = 1;
            }

        }
        hashSet.add(count);
        int max = Collections.max(hashSet);
        System.out.println(max);
        }

    }

