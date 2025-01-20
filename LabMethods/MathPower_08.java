package LabMethods;

import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double result = raisedToPower(number, power);
        System.out.printf("%.0f", result);



    }

    private static double raisedToPower(double number, int power) {
        double result = Math.pow(number, power);
        return result;
    }


}
