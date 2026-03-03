package com.backend.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
    * Errors: Unrecoverable conditions, typically related to the JVM environment (Ex:OutOfMemoryError, StackOverflowError). (subclass of Throwable)
    * Exception: Represents conditions that an application might want to catch and handle. (subclass of Throwable)
    * Exception Handling: Handles Errors in Java (try-catch-finally)
        * Try-Block: Contains code which might throw Exception
        * Catch-Block: If Exception occurs catch block will handle exception from try block (Multiple Catch + Parent catch(Exception e))
        * Finally-Block: Executed regardless of exceptions occur or not, mainly used for closing resources
        * Try-With-Resources-Block: simplifies resource management by automatically closing resources that implement the AutoCloseable interface
    * Types of Exceptions: Checked, Unchecked & Custom Exceptions
        * Checked: Exceptions that must be caught or declared in a method's signature using throws clause. (Eg:IOException)
        * Unchecked: Exceptions that do not need to be caught/declared. They usually indicate programming errors (Subclasses of RunTimeExceptions)
        * Custom: User-Defined ( if-Checked:extends Exceptions, if-Unchecked:Extends RunTimeExceptions)
    * Throw keyword: Used to explicitly throw an exception from a method or block of code.
    * Throws keyword: Used in method signature signifying method might throw an exception that needs to be handled.
    * NPE: Null Pointer Exception occurs during runtime where application attempts to use null reference in context where object is required.
        * How to Avoid?: Null Checks, Optional<> class, Defensive Programming, Annotations, Avoid returning NULL collection
 **/
public class Exceptions {

    // Checked Exception (Throws)
    public void Inputs() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Input Given " + number);
        scanner.close();
    }

    public static void main(String[] args) throws IOException {

        // Try-Catch-Finally Block
        String name = "Anmol";
        try{
            if(name.equals("Anmol")){
                throw new CustomException("Checked Custom Exception");
            }
            else{
                throw new CustomExceptionUnchecked("Unchecked Custom Exception");
            }
        }
        catch (CustomException exception){
            System.out.println("Custom Exception Occurred "+ exception);
        }
        catch (CustomExceptionUnchecked exception){
            System.out.println("Custom Exception Occurred"+ exception);
        }
        catch (Exception exception){
            exception.printStackTrace();
            System.out.println("Catch Block Executed with Exception "+ exception);
        }
        finally {
            System.out.println("Finally Block Executed");
        }
        System.out.println("Execution Continues");

        // Try-With-Resources Block
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("FilePath.txt"))){
            bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

// Custom Checked Exception
class CustomException extends Exception{
    public CustomException(String str){
        super(str);
    }
}

// Custom Unchecked Exception
class CustomExceptionUnchecked extends RuntimeException{
    public CustomExceptionUnchecked(String str){
        super(str);
    }
}