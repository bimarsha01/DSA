package com.example.NEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrapRainWater {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int op = trap(arr);
        System.out.println(op);
    }
    public static int trap(int[] heights){


        int[] prefixes = new int[heights.length-1];

        int maximum = 0;

        for(int i = 0;i<heights.length-1;i++){
            if(heights[i] >= maximum){
                prefixes[i] = heights[i];
                maximum = heights[i];
            }
            else{
                prefixes[i] = maximum;
            }
        }

        int[] suffix = new int[heights.length];

        int maximum2 = 0;

        for(int i = heights.length-1;i>=0;i--){
            if(heights[i] >= maximum2){
                suffix[i] = heights[i];
                maximum2 = heights[i];
            }
            else{
                suffix[i] = maximum2;
            }
        }

        int count = 0;
        for(int i = 0;i< heights.length-1;i++){
            count = count + Math.min(prefixes[i] , suffix[i]) - heights[i];
        }

        return count;


    }
}
