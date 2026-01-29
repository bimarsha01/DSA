package com.example.OOP.accessControl;

public class B {

   private B(){

   }
   public static B b(){
       return new B();
   }
}
