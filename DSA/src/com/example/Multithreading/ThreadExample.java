package com.example.Multithreading;

public class ThreadExample {

    static void main(String[] args) {
        Thread t1 = new thread("pasta");
        Thread t2 = new thread("pizza");
        Thread t3 = new thread("momo");
        Thread t4 = new thread("shafale");

        t1.start();
//        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}

class thread extends Thread {
    private String task;

    public thread( String task1) {
        this.task = task1;
    }

   public void run(){
        System.out.println(task + " is being created by "+ Thread.currentThread().getName());

    }
}

