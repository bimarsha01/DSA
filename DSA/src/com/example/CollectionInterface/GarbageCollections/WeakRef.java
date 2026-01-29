package com.example.CollectionInterface.GarbageCollections;

import java.lang.ref.WeakReference;

public class WeakRef {
    static void main(String[] args) {
        WeakReference<laptop> laptopWeakReference = new WeakReference(new laptop("lenevo" , "LOQ15"));
        System.out.println(laptopWeakReference.get());
        System.gc();
//        by doing this i am generally telling the jvm to delete the object that i created in the first place since this is
//        weak reference we could do that and jvm also allows it.

     try{
         Thread.sleep(10000);
     } catch (InterruptedException e) {
         throw new RuntimeException(e);
     }

        System.out.println(laptopWeakReference.get());
    }



}
class laptop{

    String name;
    String Model;

    public laptop(String name, String model) {
        this.name = name;
        Model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return Model;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "name='" + name + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}
