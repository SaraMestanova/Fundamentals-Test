package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[wagonsCount];


        for (int i = 0; i < wagonsCount; i++) {
            int peopleInWagon = Integer.parseInt(scanner.nextLine());
            wagons[i] = peopleInWagon;
        }

        int sum = 0;

        for (int num : wagons){
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println();
        System.out.println(sum);






    }
}
