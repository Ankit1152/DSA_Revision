package OOPS;

public class Main {
    public static void main(String[] args) {
        // Employee emp = new SoftwareEngineer();
        // System.out.println(emp.getName());

        // Implement the abstract method of the FUnctional Interface using Lambda Exp
        // Functional Interface reference can be used to hold the Lambda Expression
        // defintion
        // Using lambda Expression We dont need to use any separate implementation class
        // Employee emp = () -> "Software Engineer";
        // System.out.println(emp.getName());

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello " + i);
            }
        };

        Thread childThread = new Thread(runnable);
        childThread.run();

    }
}
