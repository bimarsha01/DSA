package com.example.generics;

import java.util.Arrays;

public class customarraylist {

    private int[] data;
    private int size = 0;

    public customarraylist() {
        this.data = new int[10];
    }

    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++] = num;
    }


    public void resize(){
        int[] temp = new int[data.length * 2];
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
        customarraylist list = new customarraylist();
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);
    }
}


