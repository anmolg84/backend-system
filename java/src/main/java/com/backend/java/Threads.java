package com.backend.java;

import java.util.concurrent.*;

/**
    * Thread: Each independent path of execution is called Thread, improving performance and responsiveness. (Smallest Unit used for multitasking)
    * Thread Life Cycle: (Initialize) New->(start()) Runnable->(run()) Running->(wait()/sleep()/blocked()) Waiting->(stop()) Dead.
    * Multi-Threading: Ability of java program to execute different methods/parts of code concurrently withing a single process
    * How to create Threads?
        * Extends Thread class and override run method
            * Thread Class: This class provides methods to create and manage threads directly.
        * Implements Runnable Interface and then pass it to thread constructor (Better Option as java allows multiple implements but single extend)
            * Runnable interface: A functional interface representing a task that can be executed by a thread.
    * Thread-Priority: MIN_PRIORITY(1), MAX_PRIORITY(10), NORM_PRIORITY(5), ByDefault=5;
    * Daemon thread: it is background, low-priority thread that performs supporting tasks for user (non-daemon) threads
    * Different Ways to Implement Thread Pools: Executor and ExecutorService (java.util.concurrent)
        * Executors.newFixedThreadPool(n): creates fixed size (n) pool threads
        * Executors.newCachedThreadPool(): creates flexible pool which uses existing threads when available
        * Executors.newSingleThreadExecutor(): creates single thread executor , sequential execution of task
        * Executors.newScheduledThreadPool(int corePoolSize): Scheduling task to run after delay/periodically.
        * ThreadPoolExecutor: Most Flexible way, gives granular control for mutilple threads
    * Executable Service: higher level API (java.util.concurrent) that manages pool/groups of thread (preferred way)
        * Separated Task Execution from Thread execution & provide feature like task queuing, scheduling & result management(Future<T>)
        * Callable<T>: Similar to Runnable, but its call() method is used
            * Consumed with Executor service, method can return a result of type T and can throw checked exceptions.
        * Future<T>: Represents the result management of an asynchronous computation. (Blocking & Non-Chaining)
            * It provides methods to check if the computation is complete, wait for its completion, and retrieve the result (get()).
        * CompletableFuture<T>: Extends Future and CompletionStage, allows non-blocking, chaining, exception-handled
            * Useful for reactive programming and multiple threads
    * Functions: thread.start(), thread.stop(), thread.join() {wait for other thread to complete}, thread.isAlive()
    * Thread Synchronization: control the access of threads to shared resources.
        * prevent data inconsistency issues, race conditions, & to ensure data integrity when more than one thread is modifying shared data
        * Maintain Thread Safety
    * Deadlock in MultiThreading: Two or more threads blocked indefinitely, each waiting other to release resource
        * Preventions: Avoid nested locks, Acquire locks in a consistent order, tryLock() with timeout, Use higher-level concurrency utilities
    * Techniques to ensure thread-safety in java program:
        * Synchronization(methods/block), Locks, Volatile/Atomic/ThreadLocal Variables, Concurrent Collections, Immutability, Executor Service
**/

// Using extends Thread
class Process extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("Process Thread Running " + i);
        }
    }
}

// Using runnable Interface
class RunnableProcess implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("RunnableProcess Thread Running " + i);
        }
    }
}

// RaceCondition: Two threads working on shared variable
class RaceCondition{

    // Volatile Variable: Avoiding field visibility issues
    volatile int count = 0;
    volatile boolean available;

    // To Resolve Race Condition : Avoid thread intersection
    public void incrementVariable(){
        // Synchronized Block: Lock Acquired
        synchronized (this){
            count++;
        }
        // Lock Released
    }

    // Synchronized Method
    public synchronized void consume() throws InterruptedException {
        while (available) {
            wait();
        }
        System.out.println("Consumed");
        available = false;
        notify();
    }
}

public class Threads {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Thread Creation & Execution
        Process process = new Process();
        RunnableProcess runnableProcess = new RunnableProcess();
        Thread newProcessThread = new Thread(runnableProcess);
        process.start();
        newProcessThread.start();

        // Wait for Threads to complete Tasks
        process.join(); newProcessThread.join();

        // Thread Priority: Range[1,10]
        System.out.println(process.getPriority());
        process.setPriority(Thread.MIN_PRIORITY);

        // Race Condition
        RaceCondition raceCondition = new RaceCondition();
        raceCondition.incrementVariable();
        raceCondition.consume();

        // Callable<T> & Future<T> using Executor Service Thread Pool
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return 42;
        };

        // Future.get(): Blocking & Non-Chaining
        Future<Integer> future = executor.submit(task);
        System.out.println("Task submitted");
        Integer result = future.get();
        System.out.println("Result: " + result);
        executor.shutdown();

        // CompletableFuture: Non-Blocking, Allow Chaining
        CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("Inside CompletableFuture Code");
                    return 10;
                })
                .thenApply(num -> num * 2)
                .thenAccept(finalResult ->
                        System.out.println("Result: " + finalResult)
                );
    }
}
