package com.example.NEETCODE;

import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable<Student> {

    int id;
    String name;
    int age;
    double gpa;

    Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + gpa;
    }
}

public class TreeSetPractice {

    public static void main(String[] args) {

        TreeSet<Student> studentsById = new TreeSet<>();

        studentsById.add(
                new Student(103, "John", 19, 3.2)
        );

        studentsById.add(
                new Student(101, "Bimarsha", 20, 3.8)
        );

        studentsById.add(
                new Student(102, "Alex", 22, 3.5)
        );

        System.out.println("Sorted by ID:");

        for (Student student : studentsById) {
            System.out.println(student);
        }


        Comparator<Student> byAge =
                Comparator.comparingInt(student -> student.age);

        TreeSet<Student> studentsByAge =
                new TreeSet<>(byAge);

        studentsByAge.add(
                new Student(103, "John", 19, 3.2)
        );

        studentsByAge.add(
                new Student(101, "Bimarsha", 20, 3.8)
        );

        studentsByAge.add(
                new Student(102, "Alex", 22, 3.5)
        );

        System.out.println("\nSorted by Age:");

        for (Student student : studentsByAge) {
            System.out.println(student);
        }
    }
}