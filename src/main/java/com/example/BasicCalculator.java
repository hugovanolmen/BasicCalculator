package com.example;

public class BasicCalculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Suma: " + add(a, b));
        System.out.println("Resta: " + subtract(a, b));
        System.out.println("Multiplicacion: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}