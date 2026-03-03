package com.backend.java;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/** MULTI LINE COMMENT
    * JAVA?: High-Level, Object-Oriented, Platform-Independent (WORA), Automatic Memory Management (Garbage Collection) Language
    * Java follows "Write Once, Run Anywhere" principle using JVM (Java Virtual Machine)
    * Process: Java Program(.java) -> Java Compiler(javac) -> Bytecode(.class) {Compilation}
    * Bytecode(.class) -> Java Virtual Machine(JVM) -> Machine Code {Execution: ClassLoader, ByteCodeVerifier, JIT Compiler}
    * JDK(platformDep): JRE+DevelopmentTools(Compiler & Debugger), JRE(platformDep): JVM+Libraries
 **/
@SpringBootApplication
public class Introduction {
    /**
     * Entry point of Application -> tells JVM where to start execution
     * public: Access Modifier, makes it accessible from anywhere.
     * static: Method can run without creating an object.
     * void: Method does not return any value.
     * main: Standard name of the method recognized by JVM as the program's starting point.
     * String[] args -> Accepts Command line arguments (String).
        * Can main method be overload? Yes, But JVM will still call public static void main(String[] args) for starters.
     **/
    public static void main(String[] args) {
        // Single Line Comment
        // Prints output to console: sout.print(prints on same-line) whereas sout.println(prints on new-line)
        System.out.println("Inside Introduction Class");
        System.out.print("newLine");
        System.out.print("Inside Introduction Class");
    }
}
