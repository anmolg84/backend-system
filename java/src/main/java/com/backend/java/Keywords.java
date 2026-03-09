package com.backend.java;

/**
 * Keywords in Java
    * New: Used to create an instance of a class (an object) and allocate memory for it on the heap.
    * Static: Static keyword is used for memory management primarily,
        * It allows a member (variable or method) to belong to the class itself, rather than to an instance(objects) of the class.
        * Static Methods can be overloaded, cannot be overridden as polymorphism occurs on runtime but static methods are loaded compile time.
        * Class in java cannot be static, except if it is inner class
    * Package: Organize related classes & interfaces (Modularity)
        * Avoid Naming Collision: Allows classes with the same name to exist in different packages.
        * Access Control: Control access to classes and members.
    * Final: Used to make entities immutable or to prevent modification/inheritance.
        * Final Variable: Once Initialized, cannot be changed
        * Final Class: Cannot be inherited (subclassed), E.g. String Class
        * Final Methods: Cannot be overridden by subclass
    * This: Refers to the current instance of the class
        * Differentiate instance variables from local variables
        * Calls constructor within other constructors of same class
    * Super: Refers to immediate parent class of the current object
        * super(): Access parent class methods or constructors.
        * Access parent class instance variables when they are hidden by subclass variables.
    * Abstract: Used for Abstraction of classes, methods and variables
        * Abstract Class: Class declared with abstract keywords (Meant to be SubClassed), Object of abstract class cannot be created
            * Can contain abstract & non-abstract methods.
            * Class must be abstract to have abstract methods
            * Classes can also have non-static and non-final variables.
        * Abstract-Methods: No Method Implementation (Must be implemented by SubClass)
    * Synchronized: used to achieve thread synchronization
        * Synchronized Method: Only one thread can execute it at a time for given objects
        * Synchronized Block: Restricting Access to particular section/block of code.
            * Inter-Thread Communication methods: From Object Class
                * wait(): Causes Current thread to wait and release objects lock, wait till notify(), notifyAll() or timeout occurs
                * notify(): Wakes up a single thread that is wait()ing on the same object's monitor.
                * notifyAll(): Wakes up all threads that are wait()ing on the same object's monitor.
        * Synchronized Static: Used to synchronize static methods
    * Volatile: Used to make variable volatile
        * It makes value of variable must be read and write directly from main memory rather than localCache.
        * Addressing Visibility Issues during concurrent programming
    * Transient: used to mark an instance variable of a Serializable object to indicate that it should not be part of the object's default serialized form.
        * When serialized transient fields will be ignored
        * When deserialized transient fields are set to default values (null/zero)
        * Used for confidential fields that we do not want to write/transmit over network.
**/
public class Keywords{
}