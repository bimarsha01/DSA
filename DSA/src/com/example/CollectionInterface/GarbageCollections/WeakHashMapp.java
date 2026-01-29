package com.example.CollectionInterface.GarbageCollections;

import java.awt.*;
import java.util.WeakHashMap;

public class WeakHashMapp {
    static void main(String[] args) {
        WeakHashMap<String , images> imageWeakHashMap = new WeakHashMap();
        imageWeakHashMap.put("image 1" , new images("img1"));
        imageWeakHashMap.put("image 2" , new images("img2"));
        System.out.println(imageWeakHashMap);
        simulateApplicationRunning();
        System.out.println("after runnung :" + imageWeakHashMap);
        System.gc();
//        here no matter what we do this will not be removed since there is presence of string
//        i.e.here image 1 and image 2 are string literals and string literals live in the string constant pool,
//        and they are strongly referenced for the entire lifetime
    }

    private static void simulateApplicationRunning() {
        System.out.println("simulating the application");
    try{
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    }

}
  class images{
    private String name;

      public images(String name) {
          this.name = name;
      }

      @Override
      public String toString() {
          return "image{" +
                  "name='" + name + '\'' +
                  '}';
      }
  }