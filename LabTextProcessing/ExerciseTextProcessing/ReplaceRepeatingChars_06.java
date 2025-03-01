package ExerciseTextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder result = new StringBuilder(text);
        for (int position = 0; position < result.length() - 1; position++) {
            if (result.charAt(position) == result.charAt(position + 1)) {
                result.deleteCharAt(position + 1);
                position--;
            }
        }

        System.out.println(result);
    }
}
