package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int position = 0; position < numbers.length - 1; position++) {
            int currentNum = numbers[position];
            for (int nextPosition = position + 1; nextPosition < numbers.length; nextPosition++) {
                int nextNum = numbers[nextPosition];

                if (currentNum + nextNum == magicNum){
                    System.out.println(currentNum + " " + nextNum);
                }

            }

        }
    }
}
