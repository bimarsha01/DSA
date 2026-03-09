package com.example.NEETCODE;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaxAreaOfIsland {
    static int count = 0;
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[][] arr = new int[4][3];
        for(int i = 0;i<4;i++){
            for(int j = 0;j<3;j++){
                arr[i][j] = random.nextInt(2);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        boolean[][] visited = new boolean[4][3];
        int finalOp = maxAreaOfIsland(arr , visited);
        System.out.println(finalOp);
    }
    public static int maxAreaOfIsland(int[][] arr , boolean[][] visited){

        int finalCount = 0;
        for(int i = 0;i<4;i++){
            for(int j = 0;j<3;j++){
                if(arr[i][j] == 0){
                    j++;
                }
                else if(arr[i][j] == 1){
                    count = 0;
                    count =  countOnes(arr , i , j , visited);
                    if(count > finalCount){
                        finalCount = count;
                    }
                }
            }
        }
            return finalCount;
    }

    public static int countOnes(int[][] arr, int i , int j , boolean[][] visited){

        if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length){
            return 0;
        }  if ( visited[i][j] || arr[i][j] == 0) {
            return 0;

        } else if(arr[i][j] == 1 && !visited[i][j]){
            count = count + 1;
            visited[i][j] = true;
            countOnes(arr , i+1 , j , visited );
            countOnes(arr , i-1 , j , visited );
            countOnes(arr , i , j-1 , visited );
            countOnes(arr , i, j+1 , visited );

        }
        return count;
    }
}
