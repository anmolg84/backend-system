package com.backend.java;

/**
    * Benefits of Using Dependency Injection Framework
        * Decoupling, Testability, Reusability, Maintainability, Configuration, Reduced boilerplate
    * Aspect Oriented Programming: Programming approach that helps keep your code organized by separating cross-cutting concerns
        * Cross-cutting concerns: logging, security, or transaction management (functionalities that are useful across many modules) from your main business logic.
        * It does this by defining these concerns in separate units called aspects & then automatically applying them into the core code at specific points, known as join points.
    * Best Practices of writing secure java code?
        * Input Validation, Access Controls, Avoid sensitive data in logs, Exception Handling, Use Prepaid statements, using secure API usage
        * Resource Management, Security Management, Dependency Management, Minimize Privileges
    * Aspects for Designing Highly scalable and fault-tolerant java programs
        * Microservices Architecture, Stateless service, Asynchronous Communication, Load Balancing, Database Scaling, Circuit Breaker
        * Containerization, Retries And Timeouts, Monitoring & Alerting, Distributed Caching, Idempotency
    * Common Memory Leaks:
        * DueTo: Unclosed Resources, Static Collection, InnerClass References, Improper hashcode() in collections, Excessive ThreadLocal
        * Detection: Profiler, Heap Dump Analysis, GC Logs
    * Optimize Data Interaction in Java Application:
        * Connection Pooling, Prepared Statements, Batch Processing, Caching, Asynchronous Database access, Transactions, Avoid N+1 Selects
    * JVM options for performance tuning:
        * Heap Size: -Xms<size> (initial heap size) and -Xmx<size> (maximum heap size).
        * Garbage Collector: -XX:+UseG1GC, -XX:+UseParallelGC, -XX:+UseZGC, -XX:+UseShenandoahGC to select the GC algorithm.
        * GC Logging: -Xlog:gc or -XX:+PrintGCDetails -XX:+PrintGCTimeStamps for detailed GC output.
        * JIT Compiler: Options like -XX:TieredStopAtLevel=1 (for faster startup) or -XX:MaxInlineSize for inlining control.
        * Other: -XX:+UseCompressedOops (for 64-bit JVMs to optimize object pointers), -Djava.awt.headless=true (for server-side apps).
    * Robust Logging Strategies:
        * Structured Logging, Asynchronous Logging, Log Levels, Contextual Information, Log Aggregation, Configuration, Security, Performance
**/
public class BestPractices {
}
