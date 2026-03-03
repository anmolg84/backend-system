package com.backend.java;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
    * Reflection: API that is used to examine/modify the behavior of methods, classes, and interfaces at runtime.
    * Usage: Dependency Injection, Object-Related Mapping, Testing Framework, Serialization/Deserialization libraries, dynamic proxies
    * All required classes for reflection provided under (java.lang.reflect) package
    * Used for Debugging, Testing & Dynamic object creation
 **/
public class Reflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Student student = new Student("Anmol",24);
        // Using Java Reflection
        Field[] fields = student.getClass().getDeclaredFields();
        Method[] methods = student.getClass().getDeclaredMethods();
        for(Field field:fields){
            if(field.getName().equals("studentName")){
                // Making Private Variable Accessible
                field.setAccessible(true);
                field.set(student,"Gupta");
            }
        }
        System.out.println(student.getStudentName());
        for(Method method:methods){
            if(method.getName().equals("setRollNumber")){
                method.invoke(student,23);
            }
        }
        System.out.println(student.getRollNumber());
    }
}
