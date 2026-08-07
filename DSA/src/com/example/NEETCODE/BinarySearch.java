package com.example.NEETCODE;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-3 ,-1, 0, 2, 4, 6, 8};
        int target = -2;

        int result = binarySearch(arr, target);

        System.out.println("Element found at index: " + result);
    }

    public static int binarySearch(int[] arr, int target) {

       int left = 0;
       int right = arr.length - 1;

       int finalAns = searchTarget(arr , left , right , target);

        return finalAns;
    }

    public static  int searchTarget(int[] arr , int left , int right , int target){
        if(left > right){
            return right + 1;
        }
        int mid = (left + right)/2;
        
        if(target < arr[mid]){
          return  searchTarget(arr, left, mid-1, target);
        }
        else if(target > arr[mid]){
           return searchTarget(arr, mid+1, right, target);
        }
        else {
            return mid;
        }
    }
}