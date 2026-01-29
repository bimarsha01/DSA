package com.example.List;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorAndEnemurator {
    public static void main(String[] args) {
        ArrayList<Integer> arrayLists = new ArrayList<>();
        arrayLists.add(1);
        arrayLists.add(2);
        arrayLists.add(3);
        arrayLists.add(4);

        System.out.println("the elements are: ");
        Iterator<Integer> iterator = arrayLists.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Vector<String> v = new Vector<String>();
        v.addElement("Practice");
        v.addElement("quiz");
        v.addElement("code");

        System.out.println("Vector elements are: ");
        Enumeration<String> enumeration = v.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
