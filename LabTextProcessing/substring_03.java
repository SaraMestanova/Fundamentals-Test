package LabTextProcessing;

import java.util.Scanner;

public class substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        int startIndex = secondText.indexOf(firstText);

        while (startIndex != -1) {
            secondText = secondText.replace(firstText, "");
            startIndex = secondText.indexOf(firstText);
        }
        System.out.println(secondText);
    }
}
