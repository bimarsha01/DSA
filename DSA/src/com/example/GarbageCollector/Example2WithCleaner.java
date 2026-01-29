package com.example.GarbageCollector;

import java.lang.ref.Cleaner;

public class Example2WithCleaner {

    public static final Cleaner cleaner = Cleaner.create();
//    this makes one shared cleaner instance  , create once per application

    private final Cleaner.Cleanable cleanable;

    public Example2WithCleaner(){
        System.out.println("created " + this);
    this.cleanable = cleaner.register(this , ()->{
            System.out.println("cleanup" + this);
        });
    }

    public void close(){
        cleanable.clean();
        System.out.println("manual clean called on : " + this);

    }
    public static void main(String[] args){
        System.out.println("Starting program: ");

        Example2WithCleaner obj1 = new Example2WithCleaner();
        Example2WithCleaner obj2 = new Example2WithCleaner();
        Example2WithCleaner obj3 = new Example2WithCleaner();
//        Example2WithCleaner obj1 = new Example2WithCleaner();

        System.out.println("before any reassignment: ");
        System.out.println("obj1 -> " + obj1);
        System.out.println("obj2 -> " + obj2);
        System.out.println("obj3 -> " + obj3);
        obj1 = obj2;
        obj2 = obj3;
        obj3 = null;
        System.out.println("before any reassignment: ");
        System.out.println("obj1 -> " + obj1);
        System.out.println("obj2 -> " + obj2);
        System.out.println("obj3 -> " + obj3);

        System.gc();

        try{
            Thread.sleep(1500);
            System.out.println("after short wait");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.gc();

        System.out.println("End of main program exiting");
    }


}
