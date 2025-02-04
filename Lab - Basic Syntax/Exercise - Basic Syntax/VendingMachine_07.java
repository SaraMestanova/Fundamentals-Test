package LabExercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumCoin = 0;

        String input = scanner.nextLine();
        while (!input.equals("Start")){
            double coin = Double.parseDouble(input);
            
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){    
                sumCoin += coin;
            }else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
       
        while (!product.equals("End")){
            switch (product){
                case "Nuts":
                    if (sumCoin >= 2.0){
                        System.out.println("Purchased " + product);
                        sumCoin -= 2.0;
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                break;

                case "Water":
                    if (sumCoin >= 0.7){
                        System.out.println("Purchased " + product);
                        sumCoin -= 0.7;
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                break;

                case "Crisps":
                    if (sumCoin >= 1.5){
                        System.out.println("Purchased " + product);
                        sumCoin -= 1.5;
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                break;
                case "Soda":
                    if (sumCoin >= 0.8){
                        System.out.println("Purchased " + product);
                        sumCoin -= 0.8;
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                break;
                case "Coke":
                    if (sumCoin >= 1.0){
                        System.out.println("Purchased " + product);
                        sumCoin -= 1.0;
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                break;
                default:
                    System.out.println("Invalid product");
            }


            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", sumCoin);
    }
}
