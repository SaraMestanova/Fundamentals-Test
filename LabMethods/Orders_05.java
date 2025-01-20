package LabMethods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        switch (product){
            case "coffee":
                double coffeePrice = 1.50;
                printCoffeePrice(quantity, coffeePrice);
                break;
            case "water":
                double waterPrice = 1.00;
                printWaterPrice(quantity, waterPrice);
                break;
            case "coke":
                double cokePrice = 1.40;
                printCokePrice(quantity, cokePrice);
                break;
            case "snacks":
                double snacksPrice = 2.00;
                printSnacksPrice(quantity, snacksPrice);
                break;
        }
    }

    private static void printCoffeePrice(int quantity, double coffeePrice) {
        double finalSum = quantity * coffeePrice;
        System.out.printf("%.2f", finalSum);
    }

    private static void printWaterPrice(int quantity, double waterPrice) {
        double finalSum = quantity * waterPrice;
        System.out.printf("%.2f", finalSum);
    }

    private static void printCokePrice(int quantity, double cokePrice) {
        double finalSum = quantity * cokePrice;
        System.out.printf("%.2f", finalSum);
    }

    private static void printSnacksPrice(int quantity, double snacksPrice) {
        double finalSum = quantity * snacksPrice;
        System.out.printf("%.2f", finalSum);
    }



}
