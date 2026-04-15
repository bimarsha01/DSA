package com.example.NEETCODE;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    static void main(String[] args) {
        String s1 = "OUZODYXAZV";
        String s2 = "XYZ";

        String op = windowSubstring(s1, s2);
        System.out.println(op);
    }

    public static String windowSubstring(String s1, String s2) {
        if (s2.isEmpty())
            return "";

        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : s2.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }
        int have = 0;
        int need = countT.size();
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        int l = 0;

        for (int r = 0; r < s1.length(); r++) {
            char c = s1.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (countT.containsKey(c) && window.get(c).equals(countT.get(c)))
                have++;

            while (have == need) {
                if ((r - l + 1) < resLen) {
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }

                char leftChar = s1.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);
                if (countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)) {
                    have--;
                }
                l++;
            }
        }
        return resLen == Integer.MAX_VALUE ? "" : s1.substring(res[0], res[1] + 1);
    }
}


