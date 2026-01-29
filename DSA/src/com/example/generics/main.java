package com.example.generics;

import java.util.Arrays;

public class main implements  genericInterface<Integer> {
    static void main() {
        student bimarsha = new student(18,88);
        student bimarshaa = new student(19,98);

        student[] list = {bimarsha , bimarshaa};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

if(bimarsha.compareTo(bimarshaa) < 0){
    System.out.println("what the hellee");
}

    }

    @Override
    public void display(Integer value) {

    }
}
