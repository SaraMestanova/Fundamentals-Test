package ExerciseMethods;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int firstNum = Integer.parseInt(scanner.nextLine());
         int secondNum = Integer.parseInt(scanner.nextLine());
         int thirdNum = Integer.parseInt(scanner.nextLine());
         int sum = getTheSum(firstNum, secondNum);
         int subtract = getTheSubtract(sum, thirdNum);
        System.out.println(subtract);
    }

    private static int getTheSum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    private static int getTheSubtract(int sum, int thirdNum) {
        return sum - thirdNum;
    }

}
