package com.backend.java;

/**
    * Variables: Containers that stores data in memory.
    * DataType VariableName(follows CamelCase-NamingConvention) = Value;
    * Types of Variables: Local Variables, Instance Variables, Static Variables, Final Variables.
    * Local Variables:
        * Declared within method/constructor/block.
        * Stored in Stack Memory
        * created when block is called, destroyed when block exits.
        * scope: within the block.
    * Instance Variables: (Non-Static Variables)
        * Declared in class, outside methods/block.
        * Stored in Heap Memory and Not shared between objects (Each objects has its own version)
        * created when object is created, destroyed when object is destroyed.
        * scope: throughout the class.
    * Static Variables: (Class Variables)
        * Declared in class with static keyword.
        * All instances/objects of the class share the same memory location for a static variable
        * created when program is loaded, destroyed when program is unloaded
        * we can only have one copy of static variable per class.
        * scope: throughout the class.
    * Final Variables: (Constants)
        * Declared with final keyword.
        * value cannot be changed after initialization.
        * can be local, instance, or static.
        * scope: depends on where it is declared.
    * Thread Local Variables: Provides way to store data that is unique to each thread
        * Useful for avoiding race condition and no need of synchronization
    * Instance and static variables are assigned default values 0 (Numeric), \u0000 (NUll), false(Boolean) & null(object-references)
    * Local Variables are not assigned any default values, Compile Time error will occur if not initialized.
 **/
public class Variables {

    // Instance Variable
    public String name;

    // Static Variable
    static String collegeName = "IIT Delhi";

    // Final Variable
    static final String finalVariable = "FINAL VARIABLE";

    public static void main(String[] args){

        // Local Variable
        int localVariable = 10;

        // Thread Local Variable
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        Thread thread = new Thread(()->threadLocal.set("New Thread"));
        thread.start();

        Variables varObject1 = new Variables(); varObject1.name = "Anmol";
        Variables varObject2 = new Variables(); varObject2.name = "Gupta";

        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable: " + varObject1.name);
        System.out.println("Instance Variable: " + varObject2.name);
        System.out.println("Static Variable: " + Variables.collegeName);
        System.out.println("Final Variable: " + Variables.finalVariable);
    }
}
