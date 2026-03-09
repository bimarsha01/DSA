package com.example.Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExeServiceExample {

    static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);
        CountDownLatch cd5 = new CountDownLatch(5);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        System.out.println("Starting:: ");
        executorService.execute(new MyThread(cd1 , "A"));
        executorService.execute(new MyThread(cd2 , "B"));
        executorService.execute(new MyThread(cd3 , "C"));
        executorService.execute(new MyThread(cd4 , "D"));
        executorService.execute(new MyThread(cd5 , "E"));

        try{
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
            cd5.await();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        executorService.shutdown();

        System.out.println("done");
    }

}

class MyThread implements  Runnable{
    String name;
    CountDownLatch latch;

    MyThread(CountDownLatch latch , String name){
        this.name = name;
        this.latch = latch;
        new Thread(this);
    }

    public void run(){
        for(int i = 0; i<5;i++){
            System.out.println(name + " " + i);
            latch.countDown();
        }
    }
}
