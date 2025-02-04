package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum = num2 + num1;
        int num3 = Integer.parseInt(scanner.nextLine());
        int divide = sum / num3;
        int num4 = Integer.parseInt(scanner.nextLine());
        int myltiply = divide * num4;

        System.out.println(myltiply);
    }
}
