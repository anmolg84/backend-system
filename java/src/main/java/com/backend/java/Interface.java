package com.backend.java;

/**
    * Interface: Blueprint of Class, Specifies contract for classes that implement it.
    * It contains Method Signatures, Default-Private-Static Methods
    * Interface can extend another interfaces
    * Any class can implement multiple interfaces
    * Interface = Abstract-Class(Before Java8) -> Java8(Interface+Default-Static-Methods) -> Java9(Java8-Interface+Private-Methods)
    * Types of Interfaces:
        * Normal Interfaces: By Default variables are final static, methods are public abstract
        * Functional Interfaces: Interface with exactly one single abstract method (Runnable, Callable, Comparator)
        * Marker/Tagging Interfaces: Blank/Empty Interface, used to get JVM runtime related information
    * Lambda Expression: Way to represent Instance of Functional Interface, compact way to implement single abstract method
    * Default methods: Methods in an interface with a method implementation, Can be overridden by implementing classes
    * Static methods: Methods in an interface with a method implementation that belong to the interface itself, not to any implementing class or object
**/

// Marker Interface
interface Marker{
}

// Normal Interface
interface NormalInterface{
    int var = 23;
    void show();
    void display();
    // Default Method
    default void printReceipt(double amount) {
        System.out.println("Receipt: Paid amount = " + amount);
    }
    // Static Method
    static void printReceiptStatic(double amount) {
        System.out.println("Receipt: Paid amount Static = " + amount);
    }
}

// Functional Interface
@FunctionalInterface
interface NewFunctionalInterface{
    void print();
}

// Class Implementing Multiple Interfaces
class Implementor implements NormalInterface, NewFunctionalInterface{
    @Override
    public void print() {
        System.out.println("Inside Print");
    }
    @Override
    public void show() {
        System.out.println("Inside Show");
    }
    @Override
    public void display() {
        System.out.println("Inside Display");
    }
}

public class Interface {
    public static void main(String[] args) {

        // Instance of interfaces
        Implementor implementor = new Implementor();
        NormalInterface normalInterface = new Implementor();
        normalInterface.display();
        normalInterface.printReceipt(3.456);
        NormalInterface.printReceiptStatic(3.456);

        // Lambda-Expression
        NewFunctionalInterface newFunctionalInterface = ()->{
            System.out.println("Inside Functional Interface Lambda Expression");
        };
        newFunctionalInterface.print();
    }
}