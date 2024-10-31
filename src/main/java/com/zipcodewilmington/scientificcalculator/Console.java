package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextLine();
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextInt();
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        return scanner.nextDouble();
    }

    public static Double Calculation(String operator, double x, double y) {
        Core core = new Core();

        switch (operator) {
            case "1":
                return core.sum(x, y);
            case "2":
                return core.subtract(x, y);
            case "5":
                return core.multiply(x, y);
            case "6":
                return core.divide(x, y);
            case "7":
                return core.exp(x, y);
            case "8":
                return core.percentage(x, y);
            case "9":
                return core.logValue(x, y);


            default:
                println("---Can not recognize operator. Try again!---");
                return null;
        }
    }public static Double Calculation2(String operator, double x) {
            Core core = new Core();

            switch (operator) {

                case "3":
                    return core.square(x);
                case "4":
                    return core.squareRoot(x);
                case "10":
                    return core.invertSign(x);
                case "12":
                    return core.sine(x);
                default:
                    println("---Can not recognize operator. Try again!---");
                    return null;
            }
    }
}

