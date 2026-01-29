package com.example.DSA;

import java.util.Scanner;
public class anagram{

static boolean isnagram(String a, String b) {


    a = a.toUpperCase();
    b = b.toUpperCase();

    int[] arr = new int[100];

    return false;
}

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}

