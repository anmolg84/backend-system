package com.backend.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** MULTI LINE COMMENT
    * JAVA: High-Level, Object-Oriented, Platform-Independent (WORA), Automatic Memory Management (Garbage Collection) Language
    * Java follows "Write Once, Run Anywhere" principle using JVM (Java Virtual Machine)
    * Process: Java Program(.java) -> Java Compiler(javac) -> Bytecode(.class) {Compilation}
    * Bytecode(.class) -> Java Virtual Machine(JVM) -> Machine Code {Execution: ClassLoader, ByteCodeVerifier, JIT Compiler}
    * JDK(platformDep) Java Development Kit: JRE+DevelopmentTools(Compiler & Debugger).
    * JRE(platformDep) Java Runtime Environment: JVM+Java-Libraries
    * Java Virtual Machine (JVM): Runtime environments that actually Executes javaProgram (Bytecode)
    * Class Loader: Part of JRE which loads .class files into JVM at run time, Dynamic loading of classes
        * Types of Class Loader:
            * Bootstrap CL: Loads all java core libraries (Ex:java.lang)
            * Extension CL: loads classes defined in jar files at $JAVA_HOME$/lib/ext
            * System CL: loads classes from classpath & dependencies classes
        * Class Loading: Loading, Linking(Verification, Preparation, Resolution), Initialization
    * JIT-Compiler(Just In Time): JIT identifies hot-spots(frequently executed code blocks) & convert them into native machine code during runtime.
        * Native code runs much faster than interpreted bytecode, significantly improving the performance of Java applications
    * AOT-Compilation: Converting bytecode to native machine code before java program is run.
        * GraalVm Native Image: Example for Ahead-of-Time Compilation
    * Programs: Block/Section of code inorder to achieve certain task
    * Process: Program under execution, Programs+Allocate-Resources->Execution(Process)
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
        System.out.println();

        // Application/System Class Loader
        System.out.println("Class Loader for current Class " + SpringApplication.class.getClassLoader());
        // BootStrap Class Loader
        System.out.println("Class Loader for current Class " + java.util.ArrayList.class.getClassLoader());
    }
}
