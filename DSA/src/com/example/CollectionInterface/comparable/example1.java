package com.example.CollectionInterface.comparable;

import java.sql.ClientInfoStatus;
import java.util.*;

public class example1 {

     static void main(String[] args) {
         List<student> student = new ArrayList<>();
         student.add(new student("bimarsha" , 3));
         student.add(new student("anushila " , 55));
         student.add(new student("abhishek " ,43));
         student.add(new student("sandeep " , 40));
         student.sort(new StudentIdComparator());
         System.out.println(student);
    }
}

class student {
    private String name;
    private int id;

    public student( String name,int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name , id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        student other = (student) obj;
        return id == other.getId() && Objects.equals(name ,other.getName() );
    }

    @Override
    public String toString() {
        return "id :" + id + " name : " + name;
    }
}

class StudentIdComparator implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        if (o1.getId() - o2.getId() > 0) {
            return 1;
        } else if (o1.getId() - o2.getId() < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

