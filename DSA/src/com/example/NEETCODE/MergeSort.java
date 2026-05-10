package com.example.NEETCODE;

public class MergeSort {

    public static void mergeSort(int[] arr, int low, int high) {

        // Base case: if only one element, it's already sorted
        if (low >= high) {
            return;
        }

        // Step 1: DIVIDE - Find the middle point
        int mid = (low + high) / 2;

        // Step 2: Conquer - Recursively sort left half
        mergeSort(arr, low, mid);

        // Step 3: Conquer - Recursively sort right half
        mergeSort(arr, mid + 1, high);

        // Step 4: MERGE - Combine the two sorted halves
        merge(arr, low, mid, high);
    }

    // Helper function to merge two sorted halves
    private static void merge(int[] arr, int low, int mid, int high) {

        // Create temporary arrays for left and right halves
        int leftSize = mid - low + 1;
        int rightSize = high - mid;

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        // Copy data to temporary arrays
        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < rightSize; i++) {
            right[i] = arr[mid + 1 + i];
        }

        // Merge the two temporary arrays back into original array
        int i = 0;   // index for left array
        int j = 0;   // index for right array
        int k = low; // index for original array

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left array (if any)
        while (i < leftSize) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right array (if any)
        while (j < rightSize) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Main method to test Merge Sort
    public static void main(String[] args) {

        int[] arr = {5, 2, 8,1};

        System.out.println("Original Array:");
        printArray(arr);

        // Call merge sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    // Helper method to print array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}