package com.example.Multithreading;

public class ThreadExample2 {

    public static void main(String[] args) {

        System.out.println("Main starting...");

        Threads t1 = new Threads("PizzaMaker");
        t1.start();

        try {
            Thread.sleep(2000);          // give thread time to start sleeping
            System.out.println("Main: Interrupting the worker thread now!");
            t1.interrupt();              // ← this is the key line
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main ending.");
    }
}

class Threads extends Thread {
    private String food;

    public Threads(String food) {
        super(food + "-Thread");     // sets thread name nicely
        this.food = food;
    }

    @Override
    public void run() {
        System.out.println(getName() + " starting work on " + food);

        try {
            System.out.println(getName() + " is sleeping for 10 seconds...");
            Thread.sleep(10000);                    // long sleep
            System.out.println(getName() + " finished normally");
        } catch (InterruptedException e) {
            System.out.println(getName() + " was INTERRUPTED while sleeping!");
            // Optional: clean up or stop work
        }

        System.out.println(getName() + " is done.");
    }
}