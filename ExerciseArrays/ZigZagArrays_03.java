package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countRows = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[countRows];
        int[] secondArr = new int[countRows];

        for (int row = 1; row <= countRows; row++) {
            String input = scanner.nextLine(); // "2 4"
            int firstNum = Integer.parseInt(input.split(" ")[0]);
            int secondNum = Integer.parseInt(input.split(" ")[1]);
            if (row % 2 == 0) {
                firstArr[row - 1] = secondNum;
                secondArr[row - 1] = firstNum;
            } else {
                firstArr[row - 1] = firstNum;
                secondArr[row - 1] = secondNum;
            }


        }
        for (int num : firstArr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : secondArr) {
            System.out.print(num + " ");


        }

    }
}

