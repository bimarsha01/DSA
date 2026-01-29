package com.example.DSA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.*;

public class addingArray {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            // A 2D list (List of Lists)
            List<List<Integer>> arr = new ArrayList<>();

            // Read 6 lines of space-separated integers
            IntStream.range(0, 6).forEach(i -> {
                try {

//                    here we have this row that is the list and here stream.of() inside of it there is bufferedReader that is
//                    way efficient than scanner as it buffers some of the input and is for the bigger inputs and then there is trim to
//                    remove any extra gap or something to make it clean and is split by space
//                    till here it is string and is something like ["1" , "2" , "3" , "4" ....] now the second like is map that converts
//                    string into integer meaning it becomes: [1 , 2 , 3 , 4 , 5 , 6] and there is collects that collects this and stores in the row
//                    with the add method
                    List<Integer> row = Stream.of(bufferedReader.readLine().trim().split(" "))
                            .map(Integer::parseInt)
                            .map(j->j*2)
                            .filter(k->k>6)
                            .collect(Collectors.toList());
                    arr.add(row); // add the row to 2D list
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });

//            now here there is this total sum that stores the total outcome after processing here in arr.stream() it has this List<List<Integer>>.
//            secondly there is flatmap which is very nice function that makes something like this
//            Stream<[1, 2, 3], [4, 5, 6]>
//              ↓ flatMap(List::stream)
//            Stream<1, 2, 3, 4, 5, 6>
//            and then it becomes : IntStream(1,2,3,4,5,6)
//            then finally it adds and gives the result.
            int totalSum = arr.stream()                    // Stream<List<Integer>>
                    .flatMap(List::stream)        // Flatten into Stream<Integer>
                    .mapToInt(Integer::intValue)  // Convert to IntStream
                    .sum();                       // Sum up all numbers

            System.out.println("Total sum = " + totalSum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
