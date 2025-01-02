package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liters = 255;
        int currentLiters = 0;
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count ; i++) {
            int pouredLiters = Integer.parseInt(scanner.nextLine());

            currentLiters += pouredLiters;
            if (currentLiters > liters){
                System.out.println("Insufficient capacity!");
                currentLiters -= pouredLiters;
            }
        }
        System.out.println(currentLiters);


    }

}
