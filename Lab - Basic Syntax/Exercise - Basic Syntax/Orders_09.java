package LabExercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine()); // броя поръчкi
        double money = 0;



        for (int order = 1; order <= n; order++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double totalPrice = ((days * capsulesCount) * pricePerCapsule);
            money += totalPrice;


            System.out.printf("The price for the coffee is: $%.2f%n", totalPrice);

        }
        System.out.printf("Total: $%.2f", money);
    }
}
