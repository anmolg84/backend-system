package com.backend.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
    * Serialization: process of converting an object's state into a byte stream, which can then be saved to a file or transmitted over a network
    * ObjectOutputStream.writeObject() method used for serialization.
    * To make class Serialization, Object should implement java.io.Serializable
 **/
public class Serialization {
    public static void main(String[] args)  throws IOException, ClassNotFoundException {

        Student student = new Student("Anmol Gupta",1);
        String fileName = "Path-For-Transmitting-File";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Serialization
        oos.writeObject(student);
        System.out.println("Object Saved in File");

        oos.close();
        fos.close();
    }
}
