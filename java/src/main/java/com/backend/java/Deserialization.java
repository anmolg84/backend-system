package com.backend.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
    * Deserialization: reverse process of Serialization, reconstructing an object from the byte stream.
    * ObjectInputStream.readObject() method used for deserialization
    * to Deserialization, Object should implement java.io.Serializable
 **/
public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String fileName = "Path-From-Transmitting-File";
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Deserialization
        Student student = (Student)ois.readObject();
        System.out.println(student.getRollNumber());
        System.out.println(student.getStudentName());

        ois.close();
        fis.close();
    }
}
