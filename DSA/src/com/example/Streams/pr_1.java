package com.example.Streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class pr_1 {
    public static void main(String[] args) {
        List<String> names = List.of("bimarsha", "amarsha", "ghimire", "ehimire");
        List<String> res = names.stream()
                .filter(s -> s.length() > 8)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(res);

        Map<Integer, Set<String>> countByLength =
                names.stream()
                        .collect(Collectors.groupingBy(String::length, Collectors.toSet()));

        System.out.println(countByLength);

    }

}
