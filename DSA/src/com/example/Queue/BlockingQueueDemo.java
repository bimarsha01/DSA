package com.example.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
    static void main(String[] args) {
//        this is generally considered as thread safe queue
//        it waits for the queue to become non-empty
//        simplify concurrency problems like producer consumer
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(new producer(queue));
        Thread consumer = new Thread(new consumer(queue));
        producer.start();
        consumer.start();


//        here the capacity is 5 meaning it cannot be increased more than this this is fixed
    }
}
class producer implements Runnable{
    private BlockingQueue<Integer> queue;
private int value = 0;


public producer(BlockingQueue<Integer> queue){
    this.queue = queue;
}

    @Override
    public void run() {
while(true){
   try{
       System.out.println("producer produced "+ value);
       queue.put(value++);
       Thread.sleep(1000);
   } catch (Exception e) {
       throw new RuntimeException(e);
   }
}
    }
}
class consumer implements Runnable{
    private BlockingQueue<Integer> queue;
private int value = 0;


public consumer(BlockingQueue<Integer> queue){
    this.queue = queue;
}

    @Override
    public void run() {
while(true){
   try{
       Integer take = queue.take();
       System.out.println("consumer consumed "+ take);
       Thread.sleep(2000);
   } catch (Exception e) {
       System.out.println("the consumer is interrupted");
       throw new RuntimeException(e);
   }
}
    }
}
