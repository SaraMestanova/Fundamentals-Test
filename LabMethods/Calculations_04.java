package LabMethods;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        add(command, num1, num2);
        multiply(command, num1, num2);
        subtract(command, num1, num2);
        divide(command, num1, num2);
    }

    private static void add(String command, int num1, int num2) {
        if (command.equals("add")){
            int result = num1 + num2;
            printSingleLine(result);
        }
    }



    private static void multiply(String command, int num1, int num2) {
        if (command.equals("multiply")){
            int result = num1 * num2;
            printSingleLine(result);
        }
    }

    private static void subtract(String command, int num1, int num2) {
        if (command.equals("subtract")){
            int result = num1 - num2;
            printSingleLine(result);
        }
    }

    private static void divide(String command, int num1, int num2) {
        if (command.equals("divide")){
            int result = num1 / num2;
            printSingleLine(result);
        }
    }

    private static void printSingleLine(int result) {
        System.out.println(result);
    }

}
