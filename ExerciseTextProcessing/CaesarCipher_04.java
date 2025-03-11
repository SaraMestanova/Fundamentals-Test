package ExerciseTextProcessing;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            char encryptedString = (char) (symbol + 3);
            encryptedText.append(encryptedString);
        }
        System.out.println(encryptedText);
    }
}
