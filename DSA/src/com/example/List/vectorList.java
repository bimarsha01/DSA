package com.example.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class vectorList {

        public static void main(String[] args) {
            // Non-synchronized list
            ArrayList<Integer> list1 = new ArrayList<>();

            // Synchronized version of that list
            List<Integer> syncList = Collections.synchronizedList(list1);

            // Adding elements
            syncList.add(1);
            syncList.add(2);
            syncList.add(3);

            // Printing elements
            System.out.println(syncList);
        }
    }


