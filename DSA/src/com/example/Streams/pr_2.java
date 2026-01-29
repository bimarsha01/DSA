package com.example.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class pr_2 {
    public static void main(String[] args) {
        List<String> st = List.of("bimarsha", "bimarshaaaa", "bimarshaaaa");

        List<String> res = st.stream().map(s -> s+" ").filter(s -> s.length() > 10).collect(Collectors.toList());
        System.out.println(res);
    }
}
