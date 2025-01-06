package LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] first = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] second = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {


                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                return;
            }

            sum += first[i];


        }


        System.out.println("Arrays are identical. Sum: " + sum);





    }
}
