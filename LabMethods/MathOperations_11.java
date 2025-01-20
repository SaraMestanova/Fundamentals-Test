package LabMethods;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());
        double result = calculateTheResult(firstNum, secondNum, operator);
        System.out.printf("%.0f", result);

    }

    private static double calculateTheResult(int firstNum, int secondNum, String operator) {
        double result = 0.0;
        switch (operator){
            case "/":
                result = devide(firstNum, secondNum);
                break;
            case "*":
                result = myltiply(firstNum, secondNum);
                break;
            case "+":
                result = add(firstNum, secondNum);
                break;
            case "-":
                result = subtract(firstNum, secondNum);
                break;
        }
        return result;
    }

    private static double devide(int firstNum, int secondNum) {
        double result = firstNum * 1.0 / secondNum;
        return result;
    }

    private static double myltiply(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        return result * 1.0;
    }

    private static double add(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        return result * 1.0;
    }

    private static double subtract(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        return result * 1.0;
    }

}
