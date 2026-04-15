package com.example.NEETCODE;

public class MinMaxFinding {

    // The main recursive function to find min and max
    public static int[] findMinMax(int[] arr, int low, int high) {

        int[] result = new int[2];  // result[0] = min, result[1] = max

        // Base Case 1: Only ONE element
        if (low == high) {
            result[0] = arr[low];   // min
            result[1] = arr[low];   // max
            return result;
        }

        // Base Case 2: Exactly TWO elements
        if (high == low + 1) {
            if (arr[low] < arr[high]) {
                result[0] = arr[low];   // min
                result[1] = arr[high];  // max
            } else {
                result[0] = arr[high];  // min
                result[1] = arr[low];   // max
            }
            return result;
        }

        // Step 1: DIVIDE - Find the middle index
        int mid = (low + high) / 2;

        // Step 2: Conquer left half (recursive call)
        int[] left = findMinMax(arr, low, mid);

        // Step 3: Conquer right half (recursive call)
        int[] right = findMinMax(arr, mid + 1, high);

        // Step 4: MERGE / COMBINE the results
        result[0] = Math.min(left[0], right[0]);   // overall min
        result[1] = Math.max(left[1], right[1]);   // overall max

        return result;
    }

    // Main method to test the function
    public static void main(String[] args) {

        // Example array - you can change this
        int[] arr = {5, 2, 8, 1, 9, 3, 7, 4};

        System.out.println("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call the function
        int[] result = findMinMax(arr, 0, arr.length - 1);

        System.out.println("Minimum number is: " + result[0]);
        System.out.println("Maximum number is: " + result[1]);
    }
}
