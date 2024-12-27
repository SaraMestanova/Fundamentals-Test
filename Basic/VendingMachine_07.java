package LabExercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumCoin = 0;

        String input = scanner.nextLine();
        while (!input.equals("Start")){
            double coin = Double.parseDouble(input);
            //1. proveryavame dali monetata e validna ako ne e printirame ...
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){
                //2. sumirame monetite
                sumCoin += coin;

            }else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            //3. chetem nov input
            input = scanner.nextLine();

        }
        String product = scanner.nextLine();
        //4. dokato ne poluchim end ni se chetat produkti -> while cycle
        while (!product.equals("End")){
            //5. izbroyabvame sluchaite ako go kupi printirame ... i izvajdame parite, ako ne stigat parite printvame....
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
            //8.scanirame sledvashtiya product
        }
        System.out.printf("Change: %.2f%n", sumCoin);

        //9. restoto
    }
}
