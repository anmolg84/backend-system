package com.backend.java;
/**
    * Loops: Executing statements multiple times based on a condition (Iteration/Repeating).
    * Types of Loops: While, Do-While (Exit-Controlled-Loop), For, For-Each, Nested Loops
 **/
public class Loops {
    public static void main(String[] args){

        // For Loop
        for(int i=0;i<=10;i++){
            System.out.println("For loop counter " + i);
        }

        int[] arr = {1,2,3,4,5};
        for(int num:arr){
            System.out.println("For each loop counter " + num);
        }

        // While Loop
        int i = 1;
        while(i<=5){
            System.out.println("While loop counter " + i);
            i++;
        }

        // Do-While Loop
        i = 1;
        do {
            System.out.println("Do while loop counter " + i);
            i++;
        } while(i<=10);
    }
}