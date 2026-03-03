package com.backend.java;
/**
    * JAVA: Statically typed programming language -> variables must be declared with a type.
    * Data Types: Primitive DT(store value in memory) and Non-Primitive DT(store reference(address) to value in memory).
        * Primitive Data Types: byte(1b), short(2b), int(4b), long(8b), float(4b), double(8b), char(2b), boolean(1b)
        * Non-Primitive Data Types: String, Arrays, Classes, Interfaces, Objects
    * Wrapper Classes: Provides a way to use primitive data types as objects (Byte, Integer, Float, Double, Character, Boolean)
        * Wrapper classes Supports Serialization feature: implicitly implement (java.io.Serializable) interface, Immutable
    * Literals: Any constant value that can be assigned to variable
        * NULL: special literals indicating variable does not refer to any object/absence of value/non-existent objects.
    * Values Overflow: If a value exceeds the range of its primitive data type, it wraps around to the minimum value.(2's-complement representation)
 **/
public class Datatypes {
    public static void main(String[] args) {

        // Primitive Data Types
        byte a1 = 1;
        short a2 = 2;
        int a3 = 3;
        long a4 = 4;
        float a5 = 3.2f;
        double a6 = 3.456;
        char a7 = 'a';
        boolean a8 = true;

        // Wrapper Classes
        Byte b1 = 1;
        Short b2 = 2;
        Integer b3 = 3;
        Long b4 = 4L;
        Float b5 = 5.2f;
        Double b6 = 3.456;
        Character b7 = 'A';
        Boolean b8 = true;

        // Non-Primitive Data Types
        String str = "Anmol";
        int[] arr = {1, 2, 3, 4, 5};

        // Literals
        int bin = 0b101; // binary-literal (5)
        int hex = 0x716; // hexadecimal-literal (1814)
        int zero = 100_00_00_000; // (1000000000)
        long va = 0b1L; // (1)
        double v = 12e10; // (12*10^10=1.2E11)
    }
}