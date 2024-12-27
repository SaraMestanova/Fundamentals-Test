package LabBasic;

import java.util.Scanner;

public class RefactorSumOfOddNum_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < allNum; i++) {
            int n = 2 * i + 1;
            System.out.printf("%d%n", n);
            sum = sum +( i * 2 + 1);
        }

        System.out.printf("Sum: %d%n", sum);

    }
}
