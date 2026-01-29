package com.example.Multithreading;

//import javax.sound.sampled.Line;


class Line {
  synchronized public void getline() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
     class train extends Thread {
        Line line;

        train(Line line) {
            this.line = line;
        }

        public void run() {
            line.getline();
        }
    }
    public class sync {
        public static void main(String[] args) {
            Line obj = new Line();
           train t1 = new train(obj);
           train t2 = new train(obj);
           t1.start();
           t2.start();

        }

}




