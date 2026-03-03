package com.backend.java;

/**
    * String: Immutable Class, Any operation of modification of strings creates a new string object.
    * Mutable Strings: (Mutable Sequence of Characters)
        * StringBuffer: Mutable and thread-safe (synchronized)
        * StringBuilder: Mutable and not thread-safe (faster for single-threaded environments).
        * Capacity: ByDefault capacity = 16
    * Comparison in Strings: Difference btw == & equals():
        * ==: Used for reference comparison (for objects), checking if two references point to the same memory location.
        * .equals(): method used for content comparison (for objects), checking if two objects are logically "equal" based on their values.
**/
public class Strings {
    public static void main(String[] args){

        // Immutable: Using String Class
        String name = new String("Anmol");

        // Mutable: Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Anmol");
        stringBuffer.append(" Buffer");

        // Mutable: Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Gupta");
        stringBuilder.append(" Builder");

        System.out.println("Immutable String " + name);
        System.out.println("Mutable String " + stringBuffer);
        System.out.println("Mutable String " + stringBuilder);
        System.out.println("StringBuffer capacity: " + stringBuffer.capacity());
        System.out.println("StringBuilder capacity: " + stringBuilder.capacity());
    }
}