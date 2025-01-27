package ExerciseMethods;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        printTheSmallest(num3, num2, num1);
    }

    private static void printTheSmallest(int num3, int num2, int num1) {
        System.out.println(Math.min(Math.min(num1, num2), num3));

    }

}
