package LabBasic;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < 11; i++) {
            int tot = num * i;
            System.out.printf("%d X %d = %d%n", num, i, tot);
        }

    }
}
