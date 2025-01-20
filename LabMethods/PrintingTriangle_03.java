package LabMethods;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pyramidHeight = Integer.parseInt(scanner.nextLine());
        printPyramid(pyramidHeight);
    }

    private static void printPyramid(int pyramidHeight) {
        pyramidTop(pyramidHeight);
        pyramidBottom(pyramidHeight);
    }

    private static void pyramidTop(int pyramidHeight) {
        for (int i = 1; i < pyramidHeight; i++) {
            printSingleLine(i);
        }
    }

    private static void printSingleLine(int length) {
        for (int j = 1; j <= length; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }


    private static void pyramidBottom(int pyramidHeight) {
        for (int i = pyramidHeight; i >= 1; i--) {
            printSingleLine(i);
        }
    }
}
