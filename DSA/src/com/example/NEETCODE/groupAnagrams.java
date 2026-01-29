package com.example.NEETCODE;

import java.util.*;

public class groupAnagrams {

    public static void main(String[] args) {

        String[] strs = {"act", "cat", "hat", "pots", "stop", "tops"};

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String s : strs) {

            int[] count = new int[26];

            // count characters
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // create key AFTER counting
            String key = Arrays.toString(count);

            // group anagrams
            hashMap.putIfAbsent(key, new ArrayList<>());
            hashMap.get(key).add(s);
        }

        // final result
        System.out.println(new ArrayList<>(hashMap.values()));
    }
}

//hashmap banayo ani harek string s lai liyo
// ani tyespaxi tyesko char lai badyo k ma harek 0 dekhi 25 samma since it is from a to z
// ani tyo badeko lai map le compare garyo as a key
//yadi tyo key paila nai exist garxa vane tyo paila exist gareko ma thapa navaye naya bana
// ani last ma sab lai milayera arko total list ma lera aaune.