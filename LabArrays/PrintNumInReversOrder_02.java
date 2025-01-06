package LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintNumInReversOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNum = Integer.parseInt(scanner.nextLine());
        int[] num = new int[countNum];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(scanner.nextLine());

        }
        for (int i = num.length - 1; i >= 0 ; i--) {

            System.out.print(num[i] + " ");
        }

    }
}
