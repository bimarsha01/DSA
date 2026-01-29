package com.example.Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnwriteDemo {

    static void main(String[] args) {
        CopyOnWriteArraySet<Integer> copy = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> copy1 = new ConcurrentSkipListSet<>();
        System.out.println("now printing: ");
        for(int i = 0;i<5;i++){
        copy.add(i);
        copy1.add(i);
        }
        System.out.println("Initial for the copyonwriteset " + copy);
        System.out.println("Initial for the concurrentskiplistset " + copy1);

          System.out.println("for individual: of the copyonwrite");
        for(Integer num : copy){
            System.out.println(num);
            copy.add(5);
        }
        System.out.println(copy);

System.out.println("for individual: of the concurrentskiplistset");
        for(Integer num : copy1){
            System.out.println(num);
            copy1.add(5);
//            since this is being added at the run time so it is often called weakly consistent

        }
        System.out.println(copy1);
    }
}
//generally during the constant read and write we donot use the copyonwrite since this is too expensive and makes the whole thing slower
//as the copyonwrite thing is generally makes the new copy every time i write or modify it so that makes it not that feasible but while reading
//it is mostly used and it is also thread safe and strong consistency.

