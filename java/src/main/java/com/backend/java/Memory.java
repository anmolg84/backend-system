package com.backend.java;

/**
    * Memory Management in JAVA:
        * Heap: Where objects and their corresponding instance variables are stored (shared among all threads/programs) on runtime.
        * Stack: Each thread/program has its own stack, which stores local variables and method call frames initially
        * MethodArea/MetaSpace: Stores class-level data like static variables, method code, and metadata for each loaded class.
        * String Pool: Storage area in heap space to store string literals
    * Garbage collection: An automatic process/principle in Java that reclaims (Heap) memory occupied by objects that are no longer referenced/used
        * Phase of GC: marking(alive objects) -> sweeping(claim unreferenced space) -> compacting (defragmenting memory)
        * Types of GC Algorithms:
            * Serial GC: Single-threaded, it will “stop the world” for GC. It’s great for simple client-side apps.
            * Parallel GC (Throughput Collector): Uses multiple threads for GC, but still stops the world.
                * It’s a good option for multi-CPU systems aiming for high throughput.
            * Concurrent Mark Sweep (CMS) GC: Attempts to do most work concurrently with application threads to minimize the side effects of “stopping the world”.
            * G1 (Garbage First) GC: A region-based, parallel, and concurrent collector that aims for predictable pause times. Default in modern JDKs.
            * ZGC/Shenandoah: Low-pause, scalable GCs designed for very large heaps and low latency.
        * Object Eligibility for GC:
            * Referencing object = NULL
            * Point Reference variable to another object
            * Island of isolation: 2 references variable pointing to instance of same class
    * Java Memory Model:
        * Defines/Set of rules for JVM how threads interact with memory.
        * It specifies the circumstances under which actions of one thread are visible to others.
        * ensuring consistency and ordering of memory operations across threads.
        * guarantee visibility of fields after reordering of instructions
 */
public class Memory {
    public static void main(String[] args) {
        // Calling Garbage Collector Method -> Finalize() method is called first
        System.gc();
    }
}
