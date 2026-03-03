package com.backend.java;

/**
    * Conditionals: used to control the flow of execution based on certain conditions.
    * Types: if, if-else, if-else-if, switch-case, jump-statements(break, continue, return)
    * Switch-Case: Default block will execute only if there is no match and does not need break as it is last statement.
 **/
public class Conditional {

    public static void main(String[] args){

        // if-elseif-else conditional statements
        int A = 10; int B = 23;
        if(A >= 10) {
            System.out.println("A is greater than or equal to 10");
            // Nested if-else
            if(B == 20) {
                System.out.println("B is equal to 20");
            }
            else{
                System.out.println("B is not equal to 20");
            }
        }
        else if (A <= 9 && A >= 5) {
            System.out.println("A is less than or equal to 9 and greater than or equal to 5");
        } else {
            System.out.println("A is less than 5");
        }

        // switch-case with jump conditional statements
        int result = 3;
        switch (result){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("There is No Match");
        }
    }

}
