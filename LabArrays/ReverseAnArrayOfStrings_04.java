package LabArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;

public class ReverseAnArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        for (int i = 0; i < elements.length / 2; i++) {
            String currentElement = elements[i];
            int exchangeIndex = elements.length - 1 - i;

            elements[i] = elements[exchangeIndex];
            elements[exchangeIndex] = currentElement;

        }
        String finalOne = String.join(" ", elements);
        System.out.println(finalOne);
    }
}
