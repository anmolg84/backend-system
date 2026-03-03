package com.backend.java;

import java.io.IOException;
import java.util.Scanner;

/**
    * Exception Handling: Handles Errors in Java (try-catch-finally)
        * Try-Block: Contains code which might throw Exception
        * Catch-Block: If Exception occurs catch block will handle exception from try block (Multiple Catch + Parent catch(Exception e))
        * Finally-Block: Executed regardless of exceptions occur or not, mainly used for closing resources
    * Types of Exceptions: Checked, Unchecked & Custom Exceptions
        * Checked: Exceptions that must be caught or declared in a method's signature using throws clause. (Eg:IOException)
        * Unchecked: Exceptions that do not need to be caught/declared. They usually indicate programming errors (Subclasses of RunTimeExceptions)
        * Custom: User-Defined ( if-Checked:extends Exceptions, if-Unchecked:Extends RunTimeExceptions)
    * Throw keyword: Used to explicitly throw an exception from a method or block of code.
    * Throws keyword: Used in method signature signifying method might throw an exception that needs to be handled.
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