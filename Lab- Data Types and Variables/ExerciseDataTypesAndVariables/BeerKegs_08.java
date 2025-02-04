package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countKegs = Integer.parseInt(scanner.nextLine()); // брой кегове

        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";
        //за всеки един кеф от първия (1) до последния (countKegs):
        //1. модел -> String
        //2. радиус -> double
        //3. височина -> int
        //4. обем на кега = пи * радиус * радиус * височина
        for (int i = 1; i <= countKegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > maxVolume){
                maxVolume = volume;
                maxModel = model;
            }

        }
        System.out.println(maxModel);
    }
}
