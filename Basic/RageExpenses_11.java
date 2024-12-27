package LabExercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetCount = 0;
        double mouseCount = 0;
        double keyboardCount = 0;
        double displayCount = 0;

        for (int game = 1; game <= lostGamesCount; game++) {

            if (game % 2 == 0){
                headsetCount++;
            }
            if (game % 3 == 0){
                mouseCount++;
            }
            if (game % 6 == 0){
                keyboardCount++;
            }
            if (game % 12 == 0){
                displayCount++;
            }

        }
        double totalPrice = (headsetCount * headsetPrice ) + (mouseCount * mousePrice ) + (keyboardCount * keyboardPrice ) + (displayCount * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);

    }
}
