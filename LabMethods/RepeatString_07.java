package LabMethods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());
        String newString = returnNewString(input, repeat);
        System.out.println(newString);
    }

    private static String returnNewString(String input, int repeat) {
        String current = "";
        for (int i = 0; i < repeat; i++) {
                current += input;
        }
        return current;
    }
}
