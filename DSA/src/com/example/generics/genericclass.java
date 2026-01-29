package com.example.generics;

import java.util.Arrays;

public class genericclass<T> {


        private Object[] data;

        private int size = 0;

        public genericclass() {
            this.data = new Object[10];
        }

        public void add(T num){
            if(isfull()){
                resize();
            }
            data[size++] = num;
        }


        public void resize(){
            Object[] temp = new Object[data.length * 2];
            for(int i = 0;i< data.length ;i++){
                temp[i] = data[i];
            }
            data  = temp;
        }

        public boolean isfull(){
            return size == data.length;
        }
        public int size(){
            return size;
        }

        @Override
        public String toString() {
            return "customarraylist{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }

        static void main(String[] args) {
            genericclass<Integer> list = new genericclass<>();
            list.add(4);
            list.add(5);
            list.add(6);

            System.out.println(list);
        }
    }

//    ok so there is something like there could be restrictions also about what to add and what to not
//you could create your own this choose thing like for e. g. if you do in the class in here line no 5. <T extends number> then
// you could actually just enter the no. and nothing else if you try to enter then it will give you an error
// and this is called java wildcard.




