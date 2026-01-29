package com.example.CollectionInterface.GarbageCollections;

public class gc_1 {
    static void main(String[] args) {
        phone phone = new phone("samsung" , 130000);
        System.out.println(phone);
        phone = null;
        System.out.println(phone);
    }

    static class phone {
        String name;
        int price;

        public phone(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "phone{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
    } 

