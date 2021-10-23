package com.company;

import java.util.Random;

public class Lab1 {
    private final int[][] matrix = new int[6][6];

    public int[][] getMatrix() {
        Random random = new Random();
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    public void printArray(int[][] matrix) {
        for (int[] ints : matrix) {
            for (var j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.print("Even nums on side diagonal -> ");
        System.out.print("[ ");
        printEvenSideDiagonal(matrix);
        System.out.print("]");
    }

    public void printEvenSideDiagonal(int[][] matrix) {
        for (var i = 0; i < matrix.length; i++) {
            for (var j = 0; j < matrix[0].length; j++) {
                if (i + j == matrix.length - 1) {
                    if (matrix[i][j] % 2 == 0)
                        System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    public int[] fillArray(int begin, int end, int step) {
        System.out.println();
        int[] arr = new int[end / step + 1];
        arr[0] = begin;
        for (int i = 2; i <= arr.length; i++) {
            arr[i - 1] = arr[i - 2] + step;
        }

        System.out.printf("fillArray(%s, %s, %s) -> ", begin, end, step);
        System.out.print("[ ");
        for (int j : arr) {

            System.out.print(j + " ");
        }
        System.out.print("]");
        return arr;
    }
}
