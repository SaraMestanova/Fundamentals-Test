package LabMethods;

import java.util.Scanner;

public class MultiplyEvenByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int result = getMultiplyOfEvensAndOdds(n);
        System.out.println(result);
    }

    private static int getMultiplyOfEvensAndOdds(int n) {
        n = Math.abs(n);
        int evenSum = 0;
        int oddSum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            } else {
                oddSum += lastDigit;
            }
            n /= 10;
        }

        return evenSum * oddSum;
    }
}
