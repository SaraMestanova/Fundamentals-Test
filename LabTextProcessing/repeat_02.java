package LabTextProcessing;

import java.util.Scanner;

public class repeat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split("\\s+");
        for (String string : inputArray) {
            int length = string.length();
            System.out.print(string.repeat(length));
        }
    }

}
