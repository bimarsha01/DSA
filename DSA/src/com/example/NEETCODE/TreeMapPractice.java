package com.example.NEETCODE;



//import com.example.CollectionInterface.comparable.students;

import java.util.Comparator;
import java.util.TreeMap;

class Student4 implements Comparable<Student4>{

    int id;
    String name;
    int age;

    Student4(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student4 other){
        return Integer.compare(this.id , other.id);
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age;
    }
}

public class TreeMapPractice {

    public static void main(String[] args) {

//        Comparator<Student4> byAge =
//                Comparator.comparingInt(s -> s.id);
//
//        TreeMap<Student4, String> students =
//                new TreeMap<>(byAge);

        TreeMap<Student4 , String> students = new TreeMap<>();

        students.put(
                new Student4(103, "John", 25),
                "Backend Developer"
        );

        students.put(
                new Student4(101, "Bimarsha", 20),
                "Student"
        );

        students.put(
                new Student4(102, "Alex", 22),
                "Frontend Developer"
        );

        for (var entry : students.entrySet()) {
            System.out.println(entry.getKey()
                    + " → "
                    + entry.getValue());
        }
    }
}
