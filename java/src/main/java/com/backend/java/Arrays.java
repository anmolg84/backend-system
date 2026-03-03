package com.backend.java;

/**
    * Arrays: Collection of same data type elements in contiguous memory location.
    * Types of Arrays: Fixed-size, Dynamic-Array, 1D-Array, Multi-Dimensional Array, Jagged-Array, Object-Array
 **/
public class Arrays {
    public static void main(String[] args){

        // 1D-Array
        int[] array = new int[5];
        int[] arr = {1,2,3,4,5};

        // Multi-Dimensional-Array
        int[][] arr2 = new int[4][5];
        int[][][] arr3 = new int[3][4][2];

        // Jagged-Array (Column size not fixed)
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[5];

        // Traversing An Array
        for (int num : arr) {
            System.out.println(num);
        }

        // Object-Array
        Student[] students = new Student[2];
        students[0] = new Student("Anmol",1);
        students[1] = new Student("Gupta", 2);
    }
}
