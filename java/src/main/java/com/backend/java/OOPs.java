package com.backend.java;

import java.io.Serializable;

/**
    * Object-Oriented Programming: Programming paradigm, consists 4 main principles (Encapsulation, Inheritance, Polymorphism, and Abstraction)
        * Class: Blueprint for creating object, loads when object is created using ClassLoader
        * Objects: Building built following a pre-defined blueprint (Class)
            * Every class in Java extends Object class
        * Inheritance: new class (child/subclass) can inherit properties (fields & methods) from an existing class (parent/superclass).
            * Single Level: Base class extending parent class.
            * Multi Level: Sub-Base class extending another Base class
            * Multiple Level: Java Does not support multiple level inheritance
        * Encapsulation: Binds private instance variable using Access-Modifiers (restricting direct data access)
            * Providing public getter and setter methods to access variables
            * Access modifiers: private, public, protected, default to control access to fields
        * Polymorphism: one entity/methods can take many forms
            * Compile-Time Polymorphism: Early Binding
                * Method Overloading: Same method name with different method signature (different type/number/order of parameters)
            * Runtime Polymorphism : Late Binding
                * Method Overriding: Child class provides new implementation for method that is already defined in its parent class.
            * Runtime Decision: At runtime, Java determines which method to call depending on the object's actual class.
**/
class Student implements Serializable {

    // Static Variable: Common for Class
    static String schoolName;

    // Static Block: Executes single time while loading class
    static{
        schoolName = "Macro Vision Academy";
        System.out.println("Static Block Executed Successfully");
    }

    // Static Method: Can only use static variables
    public static void returnSchoolName(){
        System.out.println("School Name is " + schoolName);
    }

    // Private Access Specifier: Access within class
    private int rollNumber;
    private String studentName;

    // Public Access Specifier: Accessible from anywhere
    public String cityName;

    // Protected Access Specifier: Accessible within package and in Subclasses
    protected Integer id;

    // Default Access Specifier
    String countryName;

    // Encapsulation: Public Getters & Setters for Private Variables
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Compile Time Polymorphism: Method Overloading
    int addNumber(int num1,int num2){
        return num1+num2;
    }

    int addNumber(int num1,int num2,int num3){
        return num1+num2+num3;
    }

    /**
     * Constructors: Special Methods use to initialize objects, Method with same name as class name and no return type
     * Constructors are called when objects are created (initialize)
     * Constructor-Overloading : Class having multiple constructor with same name & different parameters
     * Types of Constructor: Default Constructor, Parameterized Constructors
     **/
    // Default Constructor
    Student(){
        super(); // Executes Constructor of Parent Class
        System.out.println("Default Constructor Called");
    }
    // Parameterized Constructor
    Student(String name, int rollNumber){
        this(); // Executes default constructor of same class
        System.out.println("Parameterized Constructor Called");
        // Use of this keyword to refer to Instance Variables
        this.studentName = name;
        this.rollNumber = rollNumber;
        this.cityName = "Pune";
        this.countryName = "India";
    }
}

// Single Level Inheritance
class Anmol extends Student{

    // Runtime Polymorphism: Method Overriding
    @Override
    int addNumber(int num1,int num2){
        System.out.println("Override Method from Anmol Class is Called");
        return (num1+num2)*10;
    }

}

// Multi Level Inheritance: Final Class
final class AnmolKids extends Anmol{
    // Final Variable
    final String parentName = "Anmol";

    // Final Method
    public final void getParents(){
        System.out.println("Parent Name is " + parentName);
    }
}

// Abstract Class
abstract class Abstract{
    // Abstract Method
    public abstract void showPrivate();
}

// Nested Class
class OuterClass{
    public void show(){
        System.out.println("Inside Outer Class");
    }
    class InnerClass{
        public void show(){
            System.out.println("Inside Inner Class");
        }
    }
}

public class OOPs {
    public static void main(String[] args) throws ClassNotFoundException {
        // Load Class without creating an object
        // Class.forName("Anmol");

        // Object Creation
        Student student = new Student("Anmol",23);
        Anmol anmol = new Anmol();
        System.out.println(Student.schoolName);
        System.out.println(student.cityName);
        System.out.println(student.countryName);
        System.out.println(student.getRollNumber());
        System.out.println(student.addNumber(2,3));
        System.out.println(student.addNumber(2,3,4));
        System.out.println(anmol.addNumber(2,3));

        // Anonymous Objects
        new AnmolKids();

        // Upcasting: Base2Parent
        Student anmolClass = new Anmol();
        // Dynamic Method Dispatch: Decided At Runtime which addNumber() method will be called
        anmolClass.addNumber(2,3);

        // Nested Class Objects
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.show();

        // Anonymous Inner Class
        OuterClass outerClassNew = new OuterClass(){
            public void show() {
                System.out.println("In Anonymous Inner Class");
            }
        };
        outerClassNew.show();
    }
}