package com.example.learnjava;

public class MyClass {

    public static void main(String[] args) {

        /*
            Long comment area...
         */

        // integers
        int age = 26;
        long weightOfPlanet = 944221321;
        byte b = 1; //max value is 127
        short s = 156; // 2x byte
        // decimals
        float pi = 3.14f;
        double pid = 3.14; // bigger precision
        // characters
        char a = 'c';
        String name = "William Meza";
        // booleans
        boolean isTrue = true; // 1 or 0 WONT WORK!!!!

        System.out.println("My name is " + name);
        if(isTrue){
            System.out.println("I'm " + age + " years old");
        }

        MathTesting();
    }

    public static void MathTesting(){
        double a = 23;
        int b = 12;

        double total = a / b;

        System.out.println("The total is: " + total);
    }
}