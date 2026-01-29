package com.example.exceptionHandling;

public class main {
    public static void main(String[] args) {
        int a = 5;
         int b = 0;
         String name = "bimarsha";
         main mainn = new main();
         try{
             mainn.divide(a,b);
             name(name);
         }catch(Exception e){
             System.out.println(e.getMessage());
         }finally{
             System.out.println("this is the final thing");
         }


    }
     int divide(int a , int b){
        if(b==0){
            throw  new ArithmeticException("please din't divide by number 0");
        }
        return a/b;
    }

    static String name(String name) throws ownException {
        if(name == "bimarsha"){
            throw new ownException("this is not allowed");
        }
        return name;
    }
}
