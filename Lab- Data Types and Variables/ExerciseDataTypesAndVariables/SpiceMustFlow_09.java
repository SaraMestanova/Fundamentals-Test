package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int countDays = 0;
        int sumSpecies = 0;

        while (startingYield >= 100){
            countDays ++;
            int spicePerDay = startingYield - 26;
            sumSpecies += spicePerDay;
            startingYield -= 10;

        }

        sumSpecies -= 26;

        if(sumSpecies < 0){
            sumSpecies = 0;
        }
        System.out.println(countDays);
        System.out.println(sumSpecies);

    }

}
