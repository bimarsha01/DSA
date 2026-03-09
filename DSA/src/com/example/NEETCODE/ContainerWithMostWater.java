package com.example.NEETCODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerWithMostWater {

    static void main(String[] args) {

     int[] arr = {2,2,2};
     int output = maxArea(arr);

        System.out.println(STR."The total area is : \{output}");
    }

    public static int maxArea(int[] heights){

        int n = heights.length - 1;

        List<Integer> finalArea = new ArrayList<>();
        int left = 0;
        int right = n;
        int area;
        while(left<right){
            int width = right - left;
            area = width * Math.min(heights[left] , heights[right]);
            finalArea.add(area);
            if(heights[left] < heights[right]){
                left++;
            }
            else {
                right--;
            }
        }


        return Collections.max(finalArea);
    }

}
