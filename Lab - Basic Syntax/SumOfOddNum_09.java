package LabBasic;

import java.util.Scanner;

public class SumOfOddNum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalOdd = Integer.parseInt(scanner.nextLine());
        int current = 1;
        int sum = 0;

        for (int i = 1; i <= totalOdd; i++) {
            System.out.println(current);
            sum += current;
            current += 2;

        }
        System.out.printf("Sum: %d", sum);
    }
}
