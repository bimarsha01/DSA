package com.example.NEETCODE;

import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerExecutorServiceExample {

    static void main(String[] args) {
        System.out.println("A count down program that counts from 10 to 0");

    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(11);

        System.out.println("Current time: " + Calendar.getInstance().get(Calendar.SECOND));

        for(int i = 10; i>=0;i--){
            scheduler.schedule(new Task(i), 10-i, TimeUnit.SECONDS);
        }
        scheduler.shutdown();
    }


}
class  Task implements  Runnable{

    private int num;
    public Task(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println("NUMBER " + num + "Current time :" + Calendar.getInstance().get(Calendar.SECOND));
    }
}
