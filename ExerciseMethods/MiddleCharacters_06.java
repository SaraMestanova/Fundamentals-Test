package ExerciseMethods;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        printMiddleCharacter(input);
    }

    public static void printMiddleCharacter(String input) {

        int length = input.length();

        if (length % 2 != 0) {
            int indexOfMiddleChar = length / 2;
            System.out.println(input.charAt(indexOfMiddleChar));
        } else {
            int indexOfFirstMiddleChar = length / 2 - 1;
            int indexOfSecondMiddleChar = length / 2;
            System.out.print(input.charAt(indexOfFirstMiddleChar));
            System.out.print(input.charAt(indexOfSecondMiddleChar));
        }

    }
}
