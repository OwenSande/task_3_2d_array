package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int i, j, sum=0;
        //int[][] matrix = new int[10][10];
        int[][] matrix = {  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 2, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 3, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 4, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 5, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 6, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 7, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0, 8, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 9}  };

        System.out.println(Arrays.deepToString(matrix));
        //System.out.println(Arrays.toString(matrix));

        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(i==j) //condition checks for diagonal
                {
                    sum = sum + matrix[i][j];
                }
            }
        }

        System.out.printf("The sum of diagonal elements of the matrix = " + sum) ;

    }
}
