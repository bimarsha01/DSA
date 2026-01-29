package com.example.Array;

public class pr_1 {
    public static void main(String[] args) {
        int[] nums = { 10 , 20 , 30 , 40 , 40};
solution solution = new solution();

 boolean ans = solution.hasDuplicate(nums);
        System.out.println(ans);
    }
}
class solution {

    public boolean hasDuplicate(int[] nums) {

        boolean hasd = false;

        int[] arr = new int[100];
        for (int num : nums) {
            arr[num]++;
        }
        for (int j : arr) {
            if (j > 1) {
                hasd = true;
                break;
            }
        }
        return hasd;
    }
}
