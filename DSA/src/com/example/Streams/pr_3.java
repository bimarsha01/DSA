package com.example.Streams;

import java.util.List;
import java.util.stream.IntStream;

public class pr_3 {
    public static void main(String[] args) {

//    List<Integer> integers = List.of(1,2,3,4,5);

        IntStream range = IntStream.range(1,5);
        range.forEach(System.out::println);
    }

}
