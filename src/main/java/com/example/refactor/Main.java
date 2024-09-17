package com.example.refactor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("skriv første tal: ");
        double input1 = scanner.nextDouble();

        System.out.print("skriv andet tal: ");
        double input2 = scanner.nextDouble();

        System.out.println("vælg operator");
        switch (scanner.next()) {
            case "+":
                System.out.println(calculator.add(input1, input2));
                break;
            case "-":
                System.out.println(calculator.subtract(input1, input2));
                break;
            case "*":
                System.out.println(calculator.multiply(input1, input2));
                break;
            case "/":
                System.out.println(calculator.divide(input1, input2));
                break;
        }


    }
}
