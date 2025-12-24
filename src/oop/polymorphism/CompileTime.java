package oop.polymorphism;

/**
There are two types of polymorphism in Java:

Compile-time Polymorphism (Method Overloading)
Runtime Polymorphism (Method Overriding)
*/

//method overloading
//Static Binding
public class CompileTime {

}

class Calculator {
    public int add(int num1, int num2) { // Method 1: two integer parameters
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3) { // Method 2: three integer parameters
        return num1 + num2 + num3;
    }
    public double add(double num1, double num2) { // Method 3: two double parameters
        return num1 + num2;
    }
}
