package com.example.OOP;

public class InnerClasses {
    static class test {

       String name;

        public test(String name) {
            this.name = name;
        }
    }

    static void main(String[] args) {

        test a = new test("bimarsha");
        test b = new test("bimarshaa");

        System.out.println(a.name);
        System.out.println(b.name);

//         here just the inner class can be static and not just the outer class
    }
}
