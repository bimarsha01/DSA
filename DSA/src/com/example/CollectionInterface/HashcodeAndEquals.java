package com.example.CollectionInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashcodeAndEquals {

   public static void main(String[] args) {


        HashMap<student, String> map = new HashMap<>();
        student s1 = new student("bimarsha", 1);
        student s2 = new student("bimarshaa", 2);
        student s3 = new student("bimarsha", 1);



        map.put(s1 , "swe");
        map.put(s2 , "backend developer");
        map.put(s3 , "doctor");

        System.out.println("hashmap size : "+  map.size());
        System.out.println("value for p1: " + map.get(s1));
        System.out.println("value for p3: " + map.get(s3));

       System.out.println(s1);

//      here we could see the difference clearly since the object the student object that we made is actually playing with memory
//       since object create different memory and then that memory address is used to create the hashcode or something like that then
//       it obviously becomes 2 different codes for the same input so that is the reason also which is making 2 different object and the size is also 3
//       now in the map2 we have got string and integer now we know it does no directly deals with the memory and simply uses the hash function
//       and due to that also if there is same value here s1 and s3 it just replaces with one another

//       that is the reason there is just the size of 2 here


        Map<String , Integer> map2 = new HashMap<>();
        map2.put("bimarsha" , 99);
        map2.put("whatthehellee" , 94);
        map2.put("bimarsha" , 92);

        System.out.println("hashmap size for map2: "+  map2.size());
        System.out.println("value for s1 for map2: " + map2.get("bimarsha"));
        System.out.println("value for s3 for map2: " + map2.get("bimarsha"));
    }
}

class student{
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
