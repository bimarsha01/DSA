package com.example.Multithreading;

import java.util.concurrent.ConcurrentHashMap;

public class usingConcurrentmaps {
    static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String , Integer> concurrentHashMap = new ConcurrentHashMap<>();

        Runnable task = () ->{
            for(int i = 0;i < 1000 ;i++){
                concurrentHashMap.put(Thread.currentThread().getName() + i , i);
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
    t1.start();
    t2.start();
        t1.join();
        t2.join();

//        this is an example of concurrenthashmap where i run 2 independent thread simultaneously and it does not bother while running since this is concurrenthashmap and here
//        when i do the start i.e. t1.start then only all the operation is carried out till then none of the operation is started like this Runnable task is on the stand by position
//        and when the start is called and executed then inside of that the run is executed automatically without needing it to call since run is just a method that is being called to run the runnable
//        then the join helps to join the 1000 + 1000 and the final output is 2000 in total the word : Thread.currentThread.getname is done since there are 2 thread and to know which thread that us done:
//
        System.out.println(concurrentHashMap.size());

    }
}
