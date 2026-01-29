package com.example.CollectionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//what this code generally does is that it compares between the string and then give us the final result on the basis of the length of the string
//if the given string that compares to other string is negative then it comes at first if not then not in the front
public class StringComparator {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("bimarsha", "ghimire");

        list.sort((a,b) -> a.length() - b.length());
        System.out.println(list);

    }
}

    class StringComp implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }

