package LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOrOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;

       for (int number : num){
           if (number % 2 == 0){
               evenSum += number;
           }else {
               oddSum += number;
           }

       }
        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
