package com.backend.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
    * Inputs in Java: Using BufferReader(java.io) & using Scanner(java.util)
    * Input Methods throws Checked IOException (need to handle in method signature)
 **/
public class Inputs {
    public static void main(String[] args) throws IOException {

        // Using BufferReader
        System.out.println("BufferReader Input: ");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int number = Integer.parseInt(bufferedReader.readLine());
        System.out.println(number);

        // Using Scanner
        System.out.println("Scanner Input: ");
        Scanner scanner = new Scanner(System.in);
        int scannerNumber = scanner.nextInt();
        System.out.println(scannerNumber);

        // Closing Resources (Best Practices)
        bufferedReader.close();
        inputStreamReader.close();
        scanner.close();
    }
}
