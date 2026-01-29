package com.example.DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class multi_dim_array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> pr1 = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                pr1.add(Stream.of(br.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).toList());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });

    for(int i = 1;i<pr1.size()-2;i++){
        for(int j = 0;j<pr1.size();j++){
            System.out.print(pr1.get(i).get(j) + " ");
        }
        System.out.println();
    }
        br.close();
    }
}
