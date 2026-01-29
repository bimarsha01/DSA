package com.example.OOP.inheritance;

public class box {
     double h;
     double l;
     double w;

     box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    box(double side ){
        this.h = side;
        this.w = side;
        this.l = side;
    }

    box(double h, double l, double w){
        this.h = h;
        this.w = w;
        this.l = l;
    }


    box(box other){
         this.h = other.h;
         this.w = other.w;
         this.l = other.l;
    }
}
