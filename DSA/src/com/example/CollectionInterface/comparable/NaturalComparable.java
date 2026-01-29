package com.example.CollectionInterface.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NaturalComparable {
    static void main(String[] args) {
        List<students> students = new ArrayList<>();
        students.add(new students(45));
        students.add(new students(55));
        students.add(new students(43));
        students.add(new students(40));
        students.sort(null);
//        this here is natural ordering means when i write null java knows that i need to sort all of these by itself
//        java runs the loop and all that it is done by java and it compares using tomsort(merge and insertion) to sort all of the numbers
//
        System.out.println(students);
    }
}
class students implements Comparable<students>{
    private int marks;

    public students(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(students o) {
        return this.marks - o.marks;
    }

    @Override
    public String toString() {
        return "students{" +
                "marks=" + marks +
                '}';
    }
}
