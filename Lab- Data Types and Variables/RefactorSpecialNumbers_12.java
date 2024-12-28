package LabDataTypesandVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = Integer.parseInt(scanner.nextLine());

        int sumOfDigits = 0;

        int currentNumber = 0;

        boolean isSpecial = false;

        for (int i = 1; i <= numberCount; i++) {

            currentNumber = i;

            while (i > 0) {

                sumOfDigits += i % 10;
                i = i / 10;
            }
            isSpecial = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);
            System.out.printf("%d -> %b%n", currentNumber, isSpecial);
            sumOfDigits = 0; i = currentNumber;
        }

    }
}