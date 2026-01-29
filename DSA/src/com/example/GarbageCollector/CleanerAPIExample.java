package com.example.GarbageCollector;

import java.lang.ref.Cleaner;

public class CleanerAPIExample {

    static void main(String[] args) {
        Employee E1 = new Employee("bimarsha" , 20);
        Employee E2 = new Employee("bimshuu" , 20);
        Employee E3 = new Employee("bimu" , 20);

        E1.showNextId();
        {
            Employee E4 = new Employee("ANUSHILA" , 20);
            Employee E5 = new Employee("ABHISHEK" , 20);
            E4 = null;
            E5 = null;
            System.gc();
        }

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        E3.showNextId();

    }

}
class Employee {
    private String name;
    private int ID;
    private int age;

    private static int nextId = 1;
    private static final Cleaner cleaner = Cleaner.create();
    private final Cleaner.Cleanable cleanable;

    private static class State implements Runnable{

        @Override
        public void run() {
            Employee.nextId--;
        }
    }
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
        cleanable = cleaner.register(this , new State());
    }

    public void show(){
        System.out.println(STR."Id \{ID} name: \{name}age \{age}");
    }

    public void showNextId(){
        System.out.println(STR."next id of the employee will be : \{nextId}");
    }
}



