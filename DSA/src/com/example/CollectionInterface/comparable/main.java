package com.example.CollectionInterface.comparable;

import java.util.ArrayList;
import java.util.List;

public class main {
    static void main(String[] args) {
        List<student> list = new ArrayList<>();

        list.add(new student("bimarsha " , 3));
        list.add(new student("anushila " , 2));
        list.add(new student("abhishek " , 1));
        list.add(new student("sandeep " , 4));
        list.sort(null);
        System.out.println(list);
    }
}
