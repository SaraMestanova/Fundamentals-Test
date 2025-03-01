package ExerciseTextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (String string : input) {

            double result = calculateResult(string);
            sum += result;
        }
        System.out.printf("%.2f", sum);
    }

    private static double calculateResult(String string) {
        char firstLetter = string.charAt(0);
        Double number = Double.parseDouble(string.substring(1, string.length() - 1));
        char lastLetter = string.charAt(string.length() - 1);

        if (Character.isUpperCase(firstLetter)){
            number /= firstLetter - 64;
        }else if (Character.isLowerCase(firstLetter)){
            number *= firstLetter - 96;
        }

        if (Character.isUpperCase(lastLetter)){
            number -= lastLetter - 64;
        }else if (Character.isLowerCase(lastLetter)){
            number += lastLetter - 96;
        }

        return number;
    }
}
