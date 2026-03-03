package com.backend.java;

// Record Declaration
record Employee(String name, Integer employeeId){
    public static void show(){
        System.out.println("Inside Records Objects");
    }
}

/**
    * Introduced in Java-14
    * Records: Immutable Data Classes, requires only name & type of fields
    * ByDefault extends Records, cannot be extended/Subclassed (final)
    * Consists: Automatically Generated Constructors (Canonical Constructors), Getters
    * toString(), hash(), equals() inbuilt methods but no setters
    * Used as Data Containers (DTO) when you need immutable model without boilerPlate.
 * */
public class Records {
    public static void main(String[] args) {
        Employee employee = new Employee("Anmol",12345);
        System.out.println(employee);
        System.out.println(employee.name());
        System.out.println(employee.employeeId());
        System.out.println(employee.equals(new Employee("Gupta",12345)));
        Employee.show();
    }
}
