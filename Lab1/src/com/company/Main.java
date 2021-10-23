package com.company;

public class Main {
    public static void main(String[] args) {
        //Laboratory work 1
        Lab1 lab1 = new Lab1();

        //1.1
        int[][] matrix = lab1.getMatrix();
        lab1.printArray(matrix);

        //1.2
        lab1.fillArray(0,10, 2);
    }
}
