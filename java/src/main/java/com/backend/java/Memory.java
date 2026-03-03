package com.backend.java;

/**
    * Memory Management in JAVA:
        * Heap: Where objects and their corresponding instance variables are stored (shared among all threads).
        * Stack: Each thread has its own stack, which stores local variables and method call frames
        * MethodArea/MetaSpace: Stores class-level data like static variables, method code, and metadata for each loaded class.
    * Garbage collection: An automatic process/principle in Java that reclaims memory occupied by objects that are no longer referenced/used
        * Happens Automatically by JVM when low-memory or low-activity
    * Java Memory Model:
        * Defines/Set of rules for JVM how threads interact with memory.
        * It specifies the circumstances under which actions of one thread are visible to others.
        * ensuring consistency and ordering of memory operations across threads.
        * guarantee visibility of fields after reordering of instructions
 */
public class Memory {
}
