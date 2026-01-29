package com.example.DSA;

    import java.io.*;
import java.util.*;

    public class pr_1 {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            sc.close();
            boolean ispalindrome = true;

            for(int i = 0;i < A.length()/2;i++){
                if(A.charAt(i) != A.charAt(A.length() - i-1)){
                    ispalindrome = false;
                    break;
                }

            }
            if(ispalindrome){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }


        }
    }



