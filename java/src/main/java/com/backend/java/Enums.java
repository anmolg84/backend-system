package com.backend.java;

import java.util.Arrays;

/**
    * Enums: Special class representing group of constants
    * Enums cannot be extended
    * By Default extends Enum(java.lang) class, can have constructors/getters/setters
 * */
enum Status{
    RUNNING(1),
    SUCCESS(2),
    FAILED(-1),
    PAUSED(0);

    private int time;
    Status(int time){
        this.time = time;
    }
    public int getTime() {
        return time;
    }
}
public class Enums {
    public static void main(String[] args) {
        // Accessing Enum
        Status[] statuses = Status.values();
        System.out.println(Arrays.toString(statuses));
        Status status = Status.RUNNING;
        System.out.println(status.getTime());
    }
}
