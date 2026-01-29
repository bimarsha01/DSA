package com.example.Lambda;

interface runnable {
    void run();
}

public class pr_1 {
    public static void main(String[] args) {
    runnable runnable = () -> {
        System.out.println("hello i am running");
      };
    runnable.run();

    }
}


//lambda expression can only be used when there is functional interface meaning there is just the one function in the interface and now otherwise
//in the above example the runnable is the interface and there i am doing something in simple way instead of writing long line of code.