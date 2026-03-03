package com.backend.java;

/**
    * Generics: enable type-safe programming by allowing types to be parameters when defining classes, interfaces & methods
        * Catch type errors at compile time rather than at runtime.
        * Eliminate the need for explicit type casting.
        * Improve code readability and reusability.
**/
class Generic<T> {
    T object;
    Generic(T object) {
        this.object = object;
    }
    public T getObject() { return this.object; }
}

public class Generics {
    public static void main(String[] args) {
        // Instance of Integer DataType
        Generic<Integer> iObj = new Generic<>(15);
        System.out.println(iObj.getObject());

        // Instance of String DataType
        Generic<String> sObj = new Generic<>("AnmolGupta");
        System.out.println(sObj.getObject());
    }
}