package com.example.NEETCODE;

public class Solution2 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 16;

        Solution2 obj = new Solution2();

        boolean result = obj.searchMatrix(matrix, target);

        System.out.println(result);
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0;
        int bot = ROWS - 1;

        // First Binary Search: Find the correct row
        while (top <= bot) {

            int row = top + (bot - top) / 2;

            if (target > matrix[row][COLS - 1]) {
                top = row + 1;
            } else if (target < matrix[row][0]) {
                bot = row - 1;
            } else {
                break;
            }
        }

        if (top > bot) {
            return false;
        }

        int row = top + (bot - top) / 2;

        // Second Binary Search: Search within the row
        int left = 0;
        int right = COLS - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (target > matrix[row][mid]) {
                left = mid + 1;
            } else if (target < matrix[row][mid]) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
