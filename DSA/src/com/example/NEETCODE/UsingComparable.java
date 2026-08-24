package com.example.NEETCODE;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class Students implements Comparable<Students>{
    int id;
    String name;
    int age;
    double gpa;

    Students(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }


    @Override
    public int compareTo(Students o) {
        return Integer.compare(this.id , o.id);
    }
}
public class UsingComparable {
    static void main(String[] args) {
        List<Students> students = new ArrayList<>();

        students.add(new Students(103, "John", 19, 3.2));
        students.add(new Students(101, "Bimarsha", 20, 3.8));
        students.add(new Students(102, "Alex", 22, 3.5));

        Collections.sort(students);

        Comparator<Students> byName = (a, b) -> a.name.compareTo(b.name);

//        Comparator<Students> byGpa = (a,b)->Double.compare(a.gpa , b.gpa);

        Comparator<Students> byGpa =
                Comparator.comparingDouble(a-> a.gpa);


        students.sort(byGpa);

        students.sort(byName);

    }
}
