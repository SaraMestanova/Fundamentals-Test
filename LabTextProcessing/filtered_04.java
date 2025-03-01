package LabTextProcessing;

import java.util.Scanner;

public class filtered_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWords) {
            String replaceWord = "*".repeat(banWord.length());
            text = text.replace(banWord, replaceWord);

        }
        System.out.println(text);
    }
}
