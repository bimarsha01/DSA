package com.example.NEETCODE;

public class MergeSortTrace {

    // MAIN MERGE SORT FUNCTION
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return; // base case: single element
        }

        int mid = left + (right - left) / 2;

        // divide
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        // conquer (merge)
        merge(arr, left, mid, right);
    }

    // MERGE FUNCTION
    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data into temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        // merge temp arrays
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // PRINT ARRAY
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // MAIN METHOD
    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
