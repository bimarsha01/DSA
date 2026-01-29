package com.example.DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Adding {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0,5).forEach(i->{
            try{
                List<Integer> rows = Stream.of(bufferedReader.readLine().trim().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
                arr.add(rows);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        for(int i = 0; i < arr.size();i++){
            for(int j = 0;j<arr.size();j++){
                System.out.println(arr.get(i).get(j));
            }
        }
    }
}
