package ExerciseMethods;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        vowelsCountPrint(input);
    }

    private static void vowelsCountPrint(String input) {
        int countVowels = 0;

        for (char letter : input.toCharArray()) {
            if (letter == 'a' || letter == 'e' || letter == 'u' || letter == 'i' || letter == 'o'){
                countVowels++;
            }
        }
        System.out.println(countVowels);
    }
}
