package com.example;

import java.util.Scanner;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Maven Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        try {
            double result = switch (operator) {
                case '+' -> calc.add(num1, num2);
                case '-' -> calc.subtract(num1, num2);
                case '*' -> calc.multiply(num1, num2);
                case '/' -> calc.divide(num1, num2);
                default -> throw new IllegalArgumentException("Invalid operator: " + operator);
            };
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}