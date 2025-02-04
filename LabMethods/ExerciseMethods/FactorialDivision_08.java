package ExerciseMethods;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long firstFactorial = findTheFirstFactorial(firstNum);
        long secondFactorial = findTheSecondFactorial(secondNum);

        double result = getTheResult(firstFactorial, secondFactorial);

        printTheResult(result);
    }

    private static long findTheFirstFactorial(int firstNum) {
        long fact = 1;
        for (int number = 2; number <= firstNum; number++) {
            fact *= number;
        }
        return fact;
    }

    private static long findTheSecondFactorial(int secondNum) {
        long fact = 1;
        for (int number = 2; number <= secondNum; number++) {
            fact *= number;
        }
        return fact;
    }

    private static double getTheResult(Long firstFactorial, long secondFactorial) {
        double result = firstFactorial * 1.0 / secondFactorial;
        return result;
    }

    private static void printTheResult(double result) {
        System.out.printf("%.2f", result);
    }

}
